package trident.api.plugin

import com.beust.klaxon.Klaxon
import trident.api.exceptions.PluginMainNotFoundException
import trident.api.server.Server
import java.io.File
import java.net.URLClassLoader
import kotlin.reflect.KClass
import kotlin.reflect.full.primaryConstructor

interface PluginManager : MutableSet<Plugin> {
    val directory: File

    companion object {
        fun sortByDependencies(server: Server, plugins: List<PluginData>): List<Plugin> {
            val pluginsToSort = plugins.toMutableList()
            val toRemove = mutableListOf<PluginData>()
            val pluginsSorted = mutableListOf<Plugin>()

            while (pluginsToSort.isNotEmpty()) {
                pluginsToSort.removeAll(toRemove)
                toRemove.clear()
                pluginsToSort.forEach {
                    if (it.dependencies.all {
                                pluginsSorted.any { plugin ->
                                    plugin.name == it
                                }
                            }) {
                        toRemove.add(it)
                        pluginsSorted.add(instantiate(server, it))
                    }
                }
            }

            return pluginsSorted
        }

        fun load(file: File): PluginData {
            val child = URLClassLoader(arrayOf(file.toURI().toURL()), this::class.java.classLoader)

            class PluginJsonFile(
                    val main: String,
                    val dependencies: List<String>
            )

            val json = Klaxon().parse<PluginJsonFile>((child.getResource("plugin.json") ?: throw PluginMainNotFoundException(file)).openStream())!!

            val clazz: Class<*> = try {
                Class.forName(json.main, true, child)
            } catch (e: ClassNotFoundException) {
                throw IllegalStateException("Could not find main class specified in ${file.nameWithoutExtension}'s \"plugin.json\".")
            }

            require(clazz.isAssignableFrom(Plugin::class.java)) { "The plugin \"$file\" does not implement \"trident.api.plugin.Plugin\"." }

            return PluginData(
                    clazz.kotlin as KClass<out Plugin>,
                    json.dependencies,
                    child
            )
        }

        fun instantiate(server: Server, data: PluginData): Plugin {
            return data.main.primaryConstructor!!.call(server)
        }
    }
}
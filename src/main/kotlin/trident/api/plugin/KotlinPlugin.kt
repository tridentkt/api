package trident.api.plugin

import mu.KotlinLogging
import trident.api.server.Server
import java.io.File
import java.io.InputStream

abstract class KotlinPlugin(
        final override val server: Server,
        final override val name: String,
        final override val version: String,
        final override val author: String
) : Plugin {
    private val javaClass = this::class.java

    override val dataFolder = File(server.pluginManager.directory, name)
    override val logger = KotlinLogging.logger(name)

    override fun load() {}

    override fun unload() {}

    override fun getResource(name: String): InputStream? {
        return javaClass.getResourceAsStream(name)
    }
}
package trident.api.plugin

import kotlin.reflect.KClass

data class PluginData(
        val main: KClass<out Plugin>,
        val dependencies: List<String>,
        val classLoader: ClassLoader
)
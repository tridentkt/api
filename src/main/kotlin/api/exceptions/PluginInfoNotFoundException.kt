package trident.api.exceptions

import trident.api.plugin.Plugin
import java.lang.RuntimeException
import kotlin.reflect.KClass

class PluginInfoNotFoundException(clazz: KClass<out Plugin>)
    : RuntimeException("A PluginInfo annotation was not found for the plugin class: ${clazz.simpleName}")
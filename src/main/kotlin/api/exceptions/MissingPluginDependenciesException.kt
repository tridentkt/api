package trident.api.exceptions

import trident.api.plugin.Plugin
import java.lang.RuntimeException

class MissingPluginDependenciesException(plugin: Plugin, dependencies: List<String>)
    : RuntimeException("${plugin.name} requires the following dependencies which have not been enabled: $dependencies")
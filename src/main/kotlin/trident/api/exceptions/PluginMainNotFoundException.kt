package trident.api.exceptions

import java.io.File
import java.lang.RuntimeException

class PluginMainNotFoundException(file: File)
    : RuntimeException("A \"main.trident\" resource was not found for the plugin file: $file")
package trident.api.plugin

import org.slf4j.Logger
import trident.api.server.Server
import java.io.File
import java.io.InputStream

interface Plugin {
    val dataFolder: File

    val server: Server

    val name: String

    val version: String

    val author: String

    val logger: Logger

    fun load()

    fun unload()

    fun getResource(name: String): InputStream?
}
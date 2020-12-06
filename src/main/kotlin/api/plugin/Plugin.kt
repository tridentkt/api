package trident.api.plugin

import trident.api.server.Server

interface Plugin {
    val server: Server

    val name: String

    val version: String

    val author: String

    fun load()

    fun unload()
}
package trident.api.plugin

import trident.api.server.Server

open class KotlinPlugin(
        override val server: Server,
        override val name: String,
        override val version: String,
        override val author: String
) : Plugin {
    override fun load() {}

    override fun unload() {}
}
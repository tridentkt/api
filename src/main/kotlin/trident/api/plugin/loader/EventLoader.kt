package trident.api.plugin.loader

import trident.api.event.EventManager

interface EventLoader {
    fun EventManager.load()
}
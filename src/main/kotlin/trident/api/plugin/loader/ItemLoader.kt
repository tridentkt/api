package trident.api.plugin.loader

import trident.api.plugin.Plugin
import trident.api.world.ItemManager

interface ItemLoader : Plugin {
    fun ItemManager.load()
}
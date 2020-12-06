package trident.api.server

import mu.KLogger
import trident.api.command.CommandManager
import trident.api.entity.Entity
import trident.api.entity.player.Player
import trident.api.event.EventManager
import trident.api.network.NetworkManager
import trident.api.player.PlayerManager
import trident.api.plugin.PluginManager
import trident.api.world.ItemManager
import trident.api.world.WorldManager

interface Server {
    val isPremium: Boolean

    val logger: KLogger

    val pluginManager: PluginManager

    val commandManager: CommandManager

    val networkManager: NetworkManager

    val eventManager: EventManager

    val playerManager: PlayerManager

    val worldManager: WorldManager

    val itemManager: ItemManager

    val entities: Set<Entity>

    fun stop()

    fun reload()
}
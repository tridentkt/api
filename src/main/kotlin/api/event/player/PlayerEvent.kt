package trident.api.event.player

import trident.api.entity.player.Player
import trident.api.event.CommandSenderEvent

interface PlayerEvent : CommandSenderEvent {
    override val entity: Player

    val player
        get() = entity
}
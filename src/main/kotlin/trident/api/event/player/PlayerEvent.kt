package trident.api.event.player

import trident.api.entity.player.Player
import trident.api.event.CommandSenderEvent
import trident.api.event.EntityEvent
import trident.api.event.Event
import trident.api.event.HandlerList
import trident.api.server.Server

interface PlayerEvent<E : PlayerEvent<E>> : CommandSenderEvent<E> {
    override val entity: Player
}
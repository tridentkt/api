package trident.api.event

import trident.api.entity.CommandSender
import trident.api.entity.Entity
import trident.api.server.Server

interface CommandSenderEvent<E : CommandSenderEvent<E>> : EntityEvent<E> {
    override val entity: CommandSender
}
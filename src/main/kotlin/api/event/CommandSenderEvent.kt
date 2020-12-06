package trident.api.event

import trident.api.entity.CommandSender
import trident.api.entity.Entity

interface CommandSenderEvent : EntityEvent {
    override val entity: CommandSender
}
package trident.api.entity

import trident.api.message.Message
import trident.api.message.SimpleMessage
import trident.api.permission.Permissible

interface CommandSender : Entity, Permissible {
    fun message(message: Message)

    fun message(message: String)
}

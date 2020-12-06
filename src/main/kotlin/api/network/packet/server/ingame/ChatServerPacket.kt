package trident.api.network.packet.server.ingame

import trident.api.message.Message
import trident.api.MessageType
import trident.api.network.packet.ServerPacket

interface ChatServerPacket : ServerPacket {
    val message: Message

    val type: MessageType
}
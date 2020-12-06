package trident.api.network.packet.server.ingame

import trident.api.message.Message
import trident.api.network.packet.ServerPacket

interface DisconnectServerPacket : ServerPacket {
    val reason: Message
}
package trident.api.network.packet.client.ingame

import trident.api.network.packet.ClientPacket

interface ChatClientPacket : ClientPacket {
    val message: String
}
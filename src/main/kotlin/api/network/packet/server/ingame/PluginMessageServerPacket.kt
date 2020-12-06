package trident.api.network.packet.server.ingame

import trident.api.network.packet.ServerPacket

interface PluginMessageServerPacket : ServerPacket {
    val channel: String
    val data: ByteArray
}
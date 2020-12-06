package trident.api.network.packet.server.ingame

import trident.api.network.packet.ServerPacket

interface SetCompressionServerPacket : ServerPacket {
    val threshold: Int
}
package trident.api.network.packet.server.login

import trident.api.network.packet.ServerPacket

interface LoginSetCompressionServerPacket : ServerPacket {
    val threshold: Int
}
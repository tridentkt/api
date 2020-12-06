package trident.api.network.packet.server.status

import trident.api.network.packet.ServerPacket

interface StatusPongServerPacket : ServerPacket {
    val pingTime: Long
}
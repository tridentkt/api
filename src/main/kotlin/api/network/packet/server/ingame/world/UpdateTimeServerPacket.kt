package trident.api.network.packet.server.ingame.world

import trident.api.network.packet.ServerPacket

interface UpdateTimeServerPacket : ServerPacket {
    val worldAge: Long
    val time: Long
}
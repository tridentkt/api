package trident.api.network.packet.server.ingame.world

import trident.api.network.packet.ServerPacket

interface UpdateViewPositionServerPacket : ServerPacket {
    val chunkX: Int
    val chunkZ: Int
}
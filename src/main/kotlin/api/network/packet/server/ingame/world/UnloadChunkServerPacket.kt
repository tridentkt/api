package trident.api.network.packet.server.ingame.world

import trident.api.network.packet.ServerPacket

interface UnloadChunkServerPacket : ServerPacket {
    val x: Int
    val z: Int
}
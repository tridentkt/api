package trident.api.network.packet.server.ingame.world

import trident.api.network.packet.ServerPacket
import trident.api.world.Chunk

interface ChunkDataServerPacket : ServerPacket {
    val chunk: Chunk
}
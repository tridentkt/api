package trident.api.network.packet.server.ingame

import trident.api.GameMode
import trident.api.network.packet.ServerPacket
import trident.api.world.WorldType

interface RespawnServerPacket : ServerPacket {
    val dimension: Int
    val hashedSeed: Long
    val gameMode: GameMode
    val worldType: WorldType
}
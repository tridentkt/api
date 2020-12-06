package trident.api.network.packet.server.ingame

import trident.api.GameMode
import trident.api.network.packet.ServerPacket
import trident.api.world.WorldType

interface JoinGameServerPacket : ServerPacket {
    val entityId: Int
    val hardcore: Boolean
    val gameMode: GameMode
    val dimension: Int
    val hashedSeed: Long
    val maxPlayers: Int
    val worldType: WorldType
    val viewDistance: Int
    val reducedDebugInfo: Boolean
    val enableRespawnScreen: Boolean
}
package trident.api.network.packet.server.ingame.entity.spawn

import trident.api.network.packet.ServerPacket
import java.util.UUID

interface SpawnPlayerServerPacket : ServerPacket {
    val entityId: Int
    val uuid: UUID
    val x: Double
    val y: Double
    val z: Double
    val yaw: Float
    val pitch: Float
}
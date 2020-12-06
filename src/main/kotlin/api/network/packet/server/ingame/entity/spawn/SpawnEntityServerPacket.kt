package trident.api.network.packet.server.ingame.entity.spawn

import trident.api.entity.Entity
import trident.api.network.packet.ServerPacket
import java.util.UUID
import kotlin.reflect.KClass

interface SpawnEntityServerPacket : ServerPacket {
    val entityId: Int
    val uuid: UUID
    val type: KClass<out Entity>
    // TODO: val data: ObjectData
    val x: Double
    val y: Double
    val z: Double
    val yaw: Float
    val pitch: Float
    val motionX: Double
    val motionY: Double
    val motionZ: Double
}
package trident.api.network.packet.server.ingame.entity.spawn

import trident.api.entity.Entity
import trident.api.network.packet.ServerPacket
import java.util.UUID
import kotlin.reflect.KClass

interface SpawnLivingEntityServerPacket : ServerPacket {
    val entityId: Int
    val uuid: UUID
    val type: KClass<out Entity>
    val x: Double
    val y: Double
    val z: Double
    val pitch: Float
    val yaw: Float
    val headYaw: Float
    val motionX: Double
    val motionY: Double
    val motionZ: Double
}
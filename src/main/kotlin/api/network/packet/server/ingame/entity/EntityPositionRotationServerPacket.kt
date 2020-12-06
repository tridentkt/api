package trident.api.network.packet.server.ingame.entity

import trident.api.network.packet.ServerPacket

interface EntityPositionRotationServerPacket : ServerPacket {
    val entityId: Int
    val moveX: Double
    val moveY: Double
    val moveZ: Double
    val yaw: Float
    val pitch: Float
    val onGround: Boolean
}
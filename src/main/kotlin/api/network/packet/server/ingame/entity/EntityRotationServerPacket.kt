package trident.api.network.packet.server.ingame.entity

import trident.api.network.packet.ServerPacket

interface EntityRotationServerPacket : ServerPacket {
    val entityId: Int
    val yaw: Float
    val pitch: Float
    val onGround: Boolean
}
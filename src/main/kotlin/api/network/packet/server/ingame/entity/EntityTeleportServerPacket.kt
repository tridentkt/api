package trident.api.network.packet.server.ingame.entity

import trident.api.network.packet.ServerPacket

interface EntityTeleportServerPacket : ServerPacket {
    val entityId: Int
    val x : Double
    val y : Double
    val z : Double
    val yaw: Float
    val pitch: Float
    val onGround: Boolean
}
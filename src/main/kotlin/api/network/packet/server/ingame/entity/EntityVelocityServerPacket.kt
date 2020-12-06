package trident.api.network.packet.server.ingame.entity

import trident.api.network.packet.ServerPacket

interface EntityVelocityServerPacket : ServerPacket {
    val entityId: Double
    val motionX: Double
    val motionY: Double
    val motionZ: Double
}
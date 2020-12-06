package trident.api.network.packet.server.ingame.entity

import trident.api.network.packet.ServerPacket

interface VehicleMoveServerPacket : ServerPacket {
    val x: Double
    val y: Double
    val z: Double
    val yaw: Float
    val pitch: Float
}
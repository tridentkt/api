package trident.api.network.packet.client.ingame.world

import trident.api.network.packet.ClientPacket

interface VehicleMoveClientPacket : ClientPacket {
    val x: Double
    val y: Double
    val z: Double
    val yaw: Float
    val pitch: Float
}
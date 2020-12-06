package trident.api.network.packet.client.ingame.player

import trident.api.network.packet.ClientPacket

interface PlayerPositionRotationClientPacket : ClientPacket  {
    val isOnGround: Boolean
    val x: Double
    val y: Double
    val z: Double
    val yaw: Float
    val pitch: Float
}
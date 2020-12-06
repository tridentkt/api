package trident.api.network.packet.client.ingame.player

import trident.api.network.packet.ClientPacket

interface PlayerRotationClientPacket : ClientPacket {
    val isOnGround: Boolean
    val yaw: Float
    val pitch: Float
}
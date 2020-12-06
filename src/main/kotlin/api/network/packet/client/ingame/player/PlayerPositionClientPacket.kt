package trident.api.network.packet.client.ingame.player

import trident.api.network.packet.ClientPacket

interface PlayerPositionClientPacket : ClientPacket {
    val onGround: Boolean
    val x: Double
    val y: Double
    val z: Double
}
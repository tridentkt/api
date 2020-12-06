package trident.api.network.packet.client.ingame.player

import trident.api.network.packet.ClientPacket

interface PlayerMovementClientPacket : ClientPacket {
    val isOnGround: Boolean
}
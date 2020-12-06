package trident.api.network.packet.client.ingame.player

import trident.api.network.packet.ClientPacket

interface PlayerAbilitiesClientPacket : ClientPacket {
    val isInvincible: Boolean
    val canFly: Boolean
    val isFlying: Boolean
    val isInCreative: Boolean
    val flySpeed: Float
    val walkSpeed: Float
}
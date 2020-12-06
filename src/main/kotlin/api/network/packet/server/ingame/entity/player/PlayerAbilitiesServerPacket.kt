package trident.api.network.packet.server.ingame.entity.player

import trident.api.network.packet.ServerPacket

interface PlayerAbilitiesServerPacket : ServerPacket {
    val isInvincible: Boolean
    val canFly: Boolean
    val isFlying: Boolean
    val isInCreative: Boolean
    val flySpeed: Float
    val walkSpeed: Float
}
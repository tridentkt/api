package trident.api.network.packet.server.ingame.entity

import trident.api.entity.player.Animation
import trident.api.network.packet.ServerPacket

interface EntityAnimationServerPacket : ServerPacket {
    val entityId: Int
    val animation: Animation
}
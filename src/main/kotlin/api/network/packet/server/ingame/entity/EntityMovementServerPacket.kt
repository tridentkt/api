package trident.api.network.packet.server.ingame.entity

import trident.api.network.packet.ServerPacket

interface EntityMovementServerPacket : ServerPacket {
    val entityId: Int
}
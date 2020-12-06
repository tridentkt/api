package trident.api.network.packet.server.ingame.entity

import trident.api.entity.EntityStatus
import trident.api.network.packet.ServerPacket

interface EntityStatusServerPacket : ServerPacket {
    val entityId: Int
    val status: EntityStatus
}
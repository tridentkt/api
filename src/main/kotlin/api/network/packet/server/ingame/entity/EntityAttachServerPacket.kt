package trident.api.network.packet.server.ingame.entity

import trident.api.network.packet.ServerPacket

interface EntityAttachServerPacket : ServerPacket {
    val entityId: Int
    val attachedToId: Int
}
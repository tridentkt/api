package trident.api.network.packet.server.ingame.entity

import trident.api.entity.metadata.Metadata
import trident.api.network.packet.ServerPacket

interface EntityMetadataServerPacket : ServerPacket {
    val entityId: Int
    val metadata: Array<Metadata<*>>
}
package trident.api.network.packet.server.ingame.entity

import trident.api.entity.attribute.Attribute
import trident.api.network.packet.ServerPacket

interface EntityPropertiesServerPacket : ServerPacket {
    val entityId: Int
    val attributes: List<Attribute>
}
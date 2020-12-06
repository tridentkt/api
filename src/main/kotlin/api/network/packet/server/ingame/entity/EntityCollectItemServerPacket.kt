package trident.api.network.packet.server.ingame.entity

import trident.api.network.packet.ServerPacket

interface EntityCollectItemServerPacket : ServerPacket {
    val collectedEntityId: Int
    val collectorEntityId: Int
    val itemCount: Int
}
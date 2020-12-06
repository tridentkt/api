package trident.api.network.packet.server.ingame.entity

import trident.api.network.packet.ServerPacket

interface EntityHeadLookServerPacket : ServerPacket {
    val entityId: Int
    val headYaw: Float
}
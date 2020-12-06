package trident.api.network.packet.server.ingame.entity

import trident.api.network.packet.ServerPacket

interface EntityDestroyServerPacket : ServerPacket {
    val entityIds: IntArray
}
package trident.api.network.packet.server.ingame.entity

import trident.api.network.packet.ServerPacket

interface EntitySetPassengersServerPacket : ServerPacket {
    val entityId: Int
    val passengerIds: IntArray
}
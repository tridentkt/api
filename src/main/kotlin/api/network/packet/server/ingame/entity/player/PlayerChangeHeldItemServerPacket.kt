package trident.api.network.packet.server.ingame.entity.player

import trident.api.network.packet.ServerPacket

interface PlayerChangeHeldItemServerPacket : ServerPacket {
    val slot: Byte
}
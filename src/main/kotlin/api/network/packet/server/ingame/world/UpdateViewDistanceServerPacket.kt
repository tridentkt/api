package trident.api.network.packet.server.ingame.world

import trident.api.network.packet.ServerPacket

interface UpdateViewDistanceServerPacket : ServerPacket {
    val viewDistance: Int
}
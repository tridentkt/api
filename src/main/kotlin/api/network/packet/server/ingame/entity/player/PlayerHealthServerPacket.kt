package trident.api.network.packet.server.ingame.entity.player

import trident.api.network.packet.ServerPacket

interface PlayerHealthServerPacket : ServerPacket {
    val health: Float
    val food: Int
    val saturation: Float
}
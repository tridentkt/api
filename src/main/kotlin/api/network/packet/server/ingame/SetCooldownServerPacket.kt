package trident.api.network.packet.server.ingame

import trident.api.network.packet.ServerPacket

interface SetCooldownServerPacket : ServerPacket {
    val itemId: Int
    val cooldownTicks: Int
}
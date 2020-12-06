package trident.api.network.packet.server.ingame

import trident.api.network.packet.ServerPacket

interface AdvancementTabServerPacket : ServerPacket {
    val tabId: String
}
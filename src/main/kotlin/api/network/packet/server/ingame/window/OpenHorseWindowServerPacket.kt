package trident.api.network.packet.server.ingame.window

import trident.api.network.packet.ServerPacket

interface OpenHorseWindowServerPacket : ServerPacket {
    val windowId: Byte
    val numberOfSlots: Int
    val entityId: Int
}
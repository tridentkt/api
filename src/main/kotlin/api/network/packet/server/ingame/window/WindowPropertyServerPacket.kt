package trident.api.network.packet.server.ingame.window

import trident.api.network.packet.ServerPacket

interface WindowPropertyServerPacket : ServerPacket {
    val windowId: Short
    val rawProperty: Short
    val value: Short
}
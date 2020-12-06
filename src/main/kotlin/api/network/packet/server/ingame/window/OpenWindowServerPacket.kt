package trident.api.network.packet.server.ingame.window

import trident.api.network.packet.ServerPacket
import trident.api.ui.WindowType

interface OpenWindowServerPacket : ServerPacket {
    val windowId: Int
    val type: WindowType
    val name: String
}
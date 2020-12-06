package trident.api.network.packet.server.ingame.window

import trident.api.network.packet.ServerPacket

interface CloseWindowServerPacket : ServerPacket {
    var windowId: Short
}
package trident.api.network.packet.client.ingame.window

import trident.api.network.packet.ClientPacket

interface CloseWindowClientPacket : ClientPacket {
    val windowId: Byte
}
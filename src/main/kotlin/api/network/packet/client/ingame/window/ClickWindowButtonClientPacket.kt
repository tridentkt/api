package trident.api.network.packet.client.ingame.window

import trident.api.network.packet.ClientPacket

interface ClickWindowButtonClientPacket : ClientPacket {
    val windowId: Byte
    val buttonId: Byte
}
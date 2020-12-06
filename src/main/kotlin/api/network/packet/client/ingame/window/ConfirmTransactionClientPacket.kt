package trident.api.network.packet.client.ingame.window

import trident.api.network.packet.ClientPacket

interface ConfirmTransactionClientPacket : ClientPacket {
    val windowId: Byte
    val actionId: Short
    val accepted: Boolean
}
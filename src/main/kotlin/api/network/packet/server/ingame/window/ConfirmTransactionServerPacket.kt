package trident.api.network.packet.server.ingame.window

import trident.api.network.packet.ServerPacket

interface ConfirmTransactionServerPacket : ServerPacket {
    val windowId: Short
    val actionId: Short
    val accepted: Boolean
}
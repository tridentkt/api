package trident.api.network.packet.client.ingame

import trident.api.network.packet.ClientPacket

interface TabCompleteClientPacket : ClientPacket {
    val transactionId: Int

    val text: String
}
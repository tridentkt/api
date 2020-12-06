package trident.api.network.packet.server.ingame

import trident.api.message.Message
import trident.api.network.packet.ServerPacket

interface AutoCompleteServerPacket : ServerPacket {
    val transactionId: Int
    val start: Int
    val length: Int
    val matches: Array<String>
    val tooltips: Array<Message>
}
package trident.api.network.packet.server.ingame

import trident.api.message.Message
import trident.api.network.packet.ServerPacket
import trident.api.ui.TitleAction

interface TitleServerPacket : ServerPacket {
    val action: TitleAction
    val title: Message
    val fadeIn: Int
    val stay: Int
    val fadeOut: Int
}
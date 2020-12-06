package trident.api.network.packet.client.ingame

import trident.api.entity.player.BodyPart
import trident.api.entity.player.ChatVisibility
import trident.api.entity.player.Hand
import trident.api.network.packet.ClientPacket

interface SettingsClientPacket : ClientPacket {
    val locale: String

    val renderInstance: Int

    val chatVisibility: ChatVisibility

    val useChatColors: Boolean

    val visibleParts: List<BodyPart>

    val mainHand: Hand
}
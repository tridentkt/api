package trident.api.network.packet.client.ingame.window

import trident.api.advancement.AdvancementTabAction
import trident.api.network.packet.ClientPacket

interface AdvancementTabClientPacket : ClientPacket {
    val action: AdvancementTabAction
    val tabId: String
}
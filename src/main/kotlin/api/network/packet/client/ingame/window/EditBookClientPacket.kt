package trident.api.network.packet.client.ingame.window

import trident.api.entity.player.Hand
import trident.api.world.item.Item
import trident.api.network.packet.ClientPacket

interface EditBookClientPacket : ClientPacket {
    val book: Item
    val isSigning: Boolean
    val hand: Hand
}
package trident.api.network.packet.client.ingame.window

import trident.api.world.item.Item
import trident.api.network.packet.ClientPacket

interface CreativeInventoryActionClientPacket : ClientPacket {
    val slot: Int
    val clickedItem: Item
}
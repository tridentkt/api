package trident.api.network.packet.server.ingame.window

import trident.api.world.item.Item
import trident.api.network.packet.ServerPacket

interface WindowItemsServerPacket : ServerPacket {
    val windowId: Short
    val items: Array<Item>
}
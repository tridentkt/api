package trident.api.network.packet.server.ingame.window

import trident.api.world.item.Item
import trident.api.network.packet.ServerPacket

interface SetSlotServerPacket : ServerPacket {
    val windowId: Byte
    val slot: Short
    val item: Item
}
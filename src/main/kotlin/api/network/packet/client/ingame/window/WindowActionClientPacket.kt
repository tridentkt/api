package trident.api.network.packet.client.ingame.window

import trident.api.world.item.Item
import trident.api.network.packet.ServerPacket
import trident.api.ui.WindowAction

interface WindowActionClientPacket : ServerPacket {
    val windowId: Int
    val actionId: Int
    val slot: Int
    val clickedItem: Item
    val action: WindowAction
    // TODO: val param: WindowActionParam
}
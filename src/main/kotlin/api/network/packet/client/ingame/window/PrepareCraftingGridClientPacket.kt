package trident.api.network.packet.client.ingame.window

import trident.api.network.packet.ClientPacket

interface PrepareCraftingGridClientPacket : ClientPacket {
    val windowId: Byte
    val recipeId: String
    val doesMakeAll: Boolean
}
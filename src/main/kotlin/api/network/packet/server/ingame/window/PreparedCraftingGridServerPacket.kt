package trident.api.network.packet.server.ingame.window

import trident.api.network.packet.ServerPacket

interface PreparedCraftingGridServerPacket : ServerPacket {
    val windowId: Byte
    val recipeId: String
}
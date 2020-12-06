package trident.api.network.packet.client.ingame.window

import trident.api.crafting.CraftingBookDataType
import trident.api.network.packet.ClientPacket

interface CraftingBookDataClientPacket : ClientPacket {
    val type: CraftingBookDataType
    val recipeId: String
    val craftingBookOpen: Boolean
    val filterCraftingActive: Boolean
    val smeltingBookOpen: Boolean
    val filterSmeltingActive: Boolean
    val blastingBookOpen: Boolean
    val filterBlastingActive: Boolean
    val smokingBookOpen: Boolean
    val filterSmokingActive: Boolean
}
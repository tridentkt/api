package trident.api.network.packet.server.ingame

import trident.api.crafting.UnlockRecipesAction
import trident.api.network.packet.ServerPacket

interface UnlockRecipesServerPacket : ServerPacket {
    val action: UnlockRecipesAction
    val recipes: Array<String>
    val openCraftingBook: Boolean
    val activateCraftingFiltering: Boolean
    val openSmeltingBook: Boolean
    val activateSmeltingFiltering: Boolean
    val alreadyKnownRecipes: Array<String>
}
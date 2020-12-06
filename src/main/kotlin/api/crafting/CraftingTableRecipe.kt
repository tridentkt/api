package trident.api.crafting

import trident.api.entity.player.Player
import trident.api.ui.CraftingTableInventory
import trident.api.world.item.Item

private typealias I = Triple<Item<*>?, Item<*>?, Item<*>?>

class CraftingTableRecipe(
        val input: Triple<I, I, I>,
        val result: Item<*>
) : Recipe<CraftingTableInventory> {
    override fun CraftingTableInventory.check(player: Player): Boolean {
        TODO("Not yet implemented")
    }

    override fun CraftingTableInventory.give(player: Player) {
        player.inventory.main
    }
}
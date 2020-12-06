package trident.api.entity.player

import trident.api.tuple.MutNonuple
import trident.api.tuple.MutQuadruple
import trident.api.tuple.MutTriple
import trident.api.ui.Inventory
import trident.api.world.item.Item
import trident.api.world.material.ArmorMaterial

private typealias M = MutNonuple<Item<*>?, Item<*>?, Item<*>?, Item<*>?, Item<*>?, Item<*>?, Item<*>?, Item<*>?, Item<*>?>

class PlayerInventory(
        val armor: MutQuadruple<Item<out ArmorMaterial>?, Item<out ArmorMaterial>?, Item<out ArmorMaterial>?, Item<out ArmorMaterial>?>,
        var offhand: Item<*>?,
        val craftingGrid: MutQuadruple<Item<*>?, Item<*>?, Item<*>?, Item<*>?>,
        val craftingResult: Item<*>?,
        val main: MutTriple<M, M, M>,
        val hotbar: M
) : Inventory {
    // TODO: finish
    override val contents: Array<Item<*>?>
        get() = arrayOf(armor.first, armor.second, armor.third, armor.fourth, offhand, craftingGrid.first)

    fun add(item: Item<*>)
}
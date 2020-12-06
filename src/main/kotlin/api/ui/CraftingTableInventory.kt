package trident.api.ui

import trident.api.tuple.MutTriple
import trident.api.world.item.Item

private typealias I = Triple<Item<*>?, Item<*>?, Item<*>?>

class CraftingTableInventory(
        val input: MutTriple<I, I, I>,
        val result: Item<*>?
) : Inventory {
    /**
     * Elements by index:
     *  - 0 = first row, first slot
     *  - 1 = first row, second slot
     *  - 2 = first row, third slot
     *  - 3 = second row, first slot
     *  - 4 = second row, second slot
     *  - 5 = second row, third slot
     *  - 6 = third row, first slot
     *  - 7 = third row, second slot
     *  - 8 = third row, third slot
     *  - 9 = result slot
     */
    override val contents: Array<Item<*>?>
        get() = arrayOf(
                input.first.first, input.first.second, input.first.third,
                input.second.first, input.second.second, input.second.third,
                input.third.first, input.third.second, input.third.third,
                result
        )
}
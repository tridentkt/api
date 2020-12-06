package trident.api.ui

import trident.api.world.item.Item

interface Inventory {
    /**
     * This array should be functionally immutable. Editing elements in it should not have an affect on the inventory.
     */
    val contents: Array<Item<*>?>
}
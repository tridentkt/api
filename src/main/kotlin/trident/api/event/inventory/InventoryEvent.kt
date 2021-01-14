package trident.api.event.inventory

import trident.api.event.Event
import trident.api.ui.Inventory

interface InventoryEvent<E : InventoryEvent<E>> : Event<E> {
    val inventory: Inventory
}
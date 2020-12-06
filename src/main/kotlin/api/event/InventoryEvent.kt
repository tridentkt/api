package trident.api.event

import trident.api.ui.Inventory

interface InventoryEvent : Event {
    val inventory: Inventory
}
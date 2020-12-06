package trident.api.crafting

import trident.api.entity.player.Player
import trident.api.ui.Inventory

interface Recipe<I : Inventory> {
    fun I.check(player: Player): Boolean

    fun I.give(player: Player)
}
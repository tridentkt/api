package trident.api.world

import trident.api.crafting.Recipe
import trident.api.item.material.MaterialType

interface ItemManager {
    val materials: MutableSet<MaterialType<*>>

    val recipes: MutableSet<Recipe<*>>
}
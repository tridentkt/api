package trident.api.world

import trident.api.crafting.Recipe
import trident.api.world.material.MaterialCompanion

interface ItemManager {
    val materials: MutableSet<MaterialCompanion<*>>

    val recipes: MutableSet<Recipe<*>>
}
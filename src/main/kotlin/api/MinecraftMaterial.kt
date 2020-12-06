package trident.api

import trident.api.world.item.Item
import trident.api.world.material.Material
import trident.api.world.material.MaterialCompanion

enum class MinecraftMaterial(val companion: MaterialCompanion<*>) {
    ;

    fun <T : Material> makeMaterial(): T {
        return companion.makeMaterial(name.toLowerCase()) as T
    }
}
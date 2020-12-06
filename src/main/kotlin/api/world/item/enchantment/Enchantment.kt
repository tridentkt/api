package trident.api.world.item.enchantment

import trident.api.event.Event
import trident.api.world.material.Material
import kotlin.reflect.KClass

interface Enchantment {
    val label: String

    val maximumLevel: Int

    val incompatibleEnchants: Set<KClass<out Enchantment>>

    val weight: Int

    val applicableMaterials: Set<KClass<out Material>>

    fun trigger(event: Event)
}
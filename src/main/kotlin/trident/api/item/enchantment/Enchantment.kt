package trident.api.item.enchantment

import trident.api.event.Listener
import trident.api.key.Keyed
import trident.api.item.material.Material

interface Enchantment : Keyed {
    val name: String

    val maximumLevel: Int

    val weight: Int

    val listeners: Set<Listener<*>>

    fun isCompatible(enchantment: Enchantment)

    fun isApplicable(material: Material)
}
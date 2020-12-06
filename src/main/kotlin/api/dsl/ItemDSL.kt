package trident.api.dsl

import trident.api.world.item.*
import trident.api.world.item.enchantment.Enchantment
import trident.nbt.EmptyNBTCompound
import trident.nbt.NBTCompound
import trident.api.world.material.Material

inline class ItemDSL<M : Material>(val item: Item<M>) {
    inline var name
        get() = item.name
        set(value) {
            item.name = value
        }
    inline var material
        get() = item.material
        set(value) {
            item.material = value
        }
    inline var count
        get() = item.count
        set(value) {
            item.count = value
        }
    inline val lore
        get() = item.lore
    inline val enchantments
        get() = item.enchantments
    inline var nbt
        get() = item.nbt
        set(value) {
            item.nbt = value
        }
    inline var hideAttributes
        get() = item.hideAttributes
        set(value) {
            item.hideAttributes = value
        }
    inline var hideDestructionCapabilities
        get() = item.hideDestructionCapabilities
        set(value) {
            item.hideDestructionCapabilities = value
        }
    inline var hideEnchants
        get() = item.hideEnchants
        set(value) {
            item.hideEnchants = value
        }
    inline var hidePlacementCapabilities
        get() = item.hidePlacementCapabilities
        set(value) {
            item.hidePlacementCapabilities = value
        }
    inline var hidePotionEffects
        get() = item.hidePotionEffects
        set(value) {
            item.hidePotionEffects = value
        }
    inline var hideUnbreakable
        get() = item.hideUnbreakable
        set(value) {
            item.hideUnbreakable = value
        }

    inline fun lore(builderAction: MutableList<String>.() -> Unit) {
        item.lore.builderAction()
    }
}

inline fun <M : Material> item(
        material: M,
        count: Int = 1,
        name: String = material.defaultName,
        lore: List<String> = listOf(),
        enchantments: Map<Enchantment, Int> = mapOf(),
        nbt: NBTCompound = EmptyNBTCompound("" /* TODO: Fix */),
        hideAttributes: Boolean = false,
        hideDestructionCapabilities: Boolean = false,
        hideEnchants: Boolean = false,
        hidePlacementCapabilities: Boolean = false,
        hidePotionEffects: Boolean = false,
        hideUnbreakable: Boolean = false,
        block: ItemDSL<M>.() -> Unit = {}): Item<M> {
    return ItemDSL(ItemImpl(
            name, material, count,
            lore.toMutableList(), enchantments.toMutableMap(), nbt,
            hideAttributes, hideDestructionCapabilities, hideEnchants,
            hidePlacementCapabilities, hidePotionEffects, hideUnbreakable
    )).apply(block).item
}
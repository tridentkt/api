package trident.api.world.item

import trident.api.world.item.enchantment.Enchantment
import trident.nbt.NBTCompound
import trident.api.world.material.Material

data class ItemImpl<M : Material>(
        override var name: String,
        override var material: M,
        override var count: Int,
        override val lore: MutableList<String>,
        override val enchantments: MutableMap<Enchantment, Int>,
        override var nbt: NBTCompound,
        override var hideAttributes: Boolean,
        override var hideDestructionCapabilities: Boolean,
        override var hideEnchants: Boolean,
        override var hidePlacementCapabilities: Boolean,
        override var hidePotionEffects: Boolean,
        override var hideUnbreakable: Boolean
) : Item<M>
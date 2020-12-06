package trident.api.world.item

import trident.api.world.item.enchantment.Enchantment
import trident.nbt.NBTAlias
import trident.nbt.NBTCompound
import trident.api.translateColors
import trident.api.world.material.Material

interface Item<M : Material> : NBTAlias<NBTCompound> {
    var name: String

    var material: M

    var count: Int

    val lore: MutableList<String>

    val enchantments: MutableMap<Enchantment, Int>

    override var nbt: NBTCompound

    var hideAttributes: Boolean

    var hideDestructionCapabilities: Boolean

    var hideEnchants: Boolean

    var hidePlacementCapabilities: Boolean

    var hidePotionEffects: Boolean

    var hideUnbreakable: Boolean

    companion object
}

// TODO: Decide if this will be used.
fun Item<*>.addNBTMarker() {
    lore.add("&o&5(+NBT)".translateColors())
}
package trident.api.item

import trident.api.message.Message
import trident.api.item.enchantment.Enchantment
import trident.api.item.material.Material
import trident.nbt.NbtAlias
import trident.nbt.tag.NbtCompound

interface Item<M : Material> : NbtAlias<NbtCompound> {
    var name: String

    var material: M

    var count: Int

    val lore: MutableList<Message>

    val enchantments: MutableMap<Enchantment, Int>

    override var nbt: NbtCompound

    var hideAttributes: Boolean

    var hideDestructionCapabilities: Boolean

    var hideEnchants: Boolean

    var hidePlacementCapabilities: Boolean

    var hidePotionEffects: Boolean

    var hideUnbreakable: Boolean

    companion object
}
package trident.api.item.material

import trident.api.key.Keyed
import trident.api.key.NamespacedKey
import trident.api.key.SubspaceKey
import trident.nbt.tag.NbtCompound

interface MaterialType<T : Material> : Keyed {
    val maxStackSize: Int

    val name: String

    override val key: NamespacedKey

    fun NbtCompound.read(): T

    fun makeMaterial(key: SubspaceKey): T?
}
package trident.api.world.material

import trident.nbt.tag.NbtCompound

interface MaterialCompanion<T : Material> {
    val id: String

    fun NbtCompound.read(): T

    fun makeMaterial(sub: String?): T?
}
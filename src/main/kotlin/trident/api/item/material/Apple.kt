package trident.api.item.material

import trident.api.ModelData
import trident.nbt.tag.NbtCompound

object Apple : EdibleMaterial, MaterialCompanion<Apple> {
    override val defaultName
        get() = "Apple"
    override val modelData
        get() = ModelData.Minecraft(260)
    override val maxStackSize
        get() = 64
    override val companion
        get() = Apple

    override fun NbtCompound.write() {}

    override val id: String
        get() = "apple"

    override fun NbtCompound.read() = Apple

    override fun makeMaterial(sub: String?) =  Apple
}
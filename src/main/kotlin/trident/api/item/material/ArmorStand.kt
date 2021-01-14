package trident.api.item.material

import trident.nbt.NBTCompound

// TODO: Finish
object ArmorStand : Material {
    override val defaultName: String
        get() = "Armor Stand"
    override val modelData: Int
        get() = TODO("Not yet implemented")
    override val maxStackSize: Int
        get() = 16

    override fun write(nbt: NBTCompound) {
        TODO("Not yet implemented")
    }
}
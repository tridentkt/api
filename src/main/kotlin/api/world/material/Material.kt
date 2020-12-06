package trident.api.world.material

import trident.api.ModelData
import trident.nbt.tag.NbtCompound

interface Material {
    val defaultName: String

    val modelData: ModelData

    val maxStackSize: Int

    val companion: MaterialCompanion<out Material>

    fun NbtCompound.write()
}

inline val Material.numericalId
    get() = (modelData as? ModelData.Minecraft)?.itemId
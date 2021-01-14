package trident.api.item.material

import trident.api.ModelData
import trident.nbt.NbtAlias
import trident.nbt.tag.NbtCompound

interface Material : NbtAlias<NbtCompound> {
    val modelData: ModelData

    val type: MaterialType<out Material>
}
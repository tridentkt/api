package trident.api.world.block

import trident.api.world.location.Location
import trident.api.item.material.BlockMaterial
import trident.nbt.NbtAlias
import trident.nbt.tag.NbtCompound

interface Block<M : BlockMaterial> : NbtAlias<NbtCompound> {
    val material: M

    val location: Location
}
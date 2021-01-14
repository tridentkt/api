package trident.api.entity

import trident.nbt.NbtAlias
import trident.nbt.tag.NbtCompound

interface Entity : NbtAlias<NbtCompound> {
    var age: Int
}
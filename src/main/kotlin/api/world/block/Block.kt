package trident.api.world.block

import trident.api.world.material.Material
import trident.api.world.location.WorldLocation
import trident.api.world.biome.Biome
import trident.api.world.location.Location
import trident.api.world.material.BlockMaterial

interface Block<M : BlockMaterial> {
    val material: M

    val biome: Biome

    val location: Location
}
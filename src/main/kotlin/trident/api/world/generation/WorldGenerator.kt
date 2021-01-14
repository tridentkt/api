package trident.api.world.generation

import trident.api.world.Chunk
import trident.api.world.World
import trident.api.world.WorldLoader
import trident.api.world.location.WorldLocation

interface WorldGenerator {
    fun generate(x: Int, z: Int, world: World): Chunk
}
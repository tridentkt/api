package trident.api.world.generation

import trident.api.world.World
import trident.api.world.WorldLoader
import trident.api.world.location.WorldLocation

interface WorldGenerator {
    fun generate(name: String, seed: Long, spawnLocation: WorldLocation, loader: WorldLoader): World
}
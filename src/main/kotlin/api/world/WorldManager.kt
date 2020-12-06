package trident.api.world

import trident.api.world.generation.WorldGenerator

interface WorldManager {
    val worlds : MutableSet<World>

    val worldGenerators: MutableSet<WorldGenerator>
}
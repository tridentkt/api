package trident.api.world

import trident.api.world.block.Block
import trident.api.world.generation.WorldGenerator
import trident.api.world.location.FlatLocation
import trident.api.world.location.Location
import trident.api.world.location.WorldLocation

interface World {
    /**
     * The name of the world.
     */
    val name: String

    /**
     * The seed of the world.
     */
    val seed: Long

    /**
     * The location at which players will spawn on first-join and will respawn to if they have not overridden their spawn location.
     */
    val spawnLocation: WorldLocation

    val loader: WorldLoader

    /**
     * The chunks in the world.
     */
    val chunks: Set<Chunk>

    val generator: WorldGenerator

    /**
     * This will load the chunk if not previously loaded.
     *
     * @return the chunk at the [location].
     * @throws NoSuchElementException if the specified chunk doesn't exist, i.e. it has not been generated.
     */
    operator fun get(location: FlatLocation): Chunk

    /**
     * This will load the chunk of the specified block if not previously loaded.
     *
     * @return the block at the [location].
     */
    operator fun get(location: Location): WorldBlock

    /**
     * @return the highest Y coordinate where a block is present.
     */
    fun getHighestY(x: Int, z: Int): Int

    /**
     * This sets a [chunk] at a certain [location] in the world.
     */
    operator fun set(location: FlatLocation, chunk: Chunk)

    /**
     * This sets a [block] at a certain [location] in the world.
     */
    operator fun set(location: Location, block: Block<*>)
}
package trident.api.world

import trident.api.world.block.Block
import trident.api.world.location.FlatLocation
import trident.api.world.location.FlatWorldLocation

/**
 * This represents a 16x256x16 chunk of blocks.
 */
interface Chunk {
    /**
     * @return all of the blocks in the chunk.
     */
    val blocks: Set<Block<*>>

    /**
     * Note: this contains the world to which the chunk belongs.
     *
     * @return the location of the chunk on an X-Z plane.
     */
    val location: FlatWorldLocation
}
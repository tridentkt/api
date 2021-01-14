package trident.api.schematic

import trident.api.world.block.Block

/**
 * This represents a placeable schematic.
 * The 0-0-0 coordinate is where the player places the schematic.
 */
interface Schematic {
    val blocks: Set<Block<*>>
}
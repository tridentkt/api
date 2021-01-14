package trident.api.world

import trident.api.world.block.Block
import trident.api.world.location.WorldLocation

interface WorldBlock : Block {
    override val location: WorldLocation
}
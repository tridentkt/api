package trident.api.world.location

import trident.api.world.World

interface WorldLocation : FlatWorldLocation, Location {
    override val world: World
    override var x: Double
    override var y: Double
    override var z: Double
}

data class WorldLocationImpl(
        override val world: World,
        override var x: Double,
        override var y: Double,
        override var z: Double
) : WorldLocation

inline fun worldLocation(world: World, x: Double, y: Double, z: Double): WorldLocation {
    return WorldLocationImpl(world, x, y, z)
}
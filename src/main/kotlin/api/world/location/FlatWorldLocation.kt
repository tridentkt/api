package trident.api.world.location

import trident.api.world.World

interface FlatWorldLocation : FlatLocation {
    val world: World
}

data class FlatWorldLocationImpl(
        override val world: World,
        override var x: Double,
        override var z: Double
) : FlatWorldLocation

inline fun flatWorldLocation(world: World, x: Double, z: Double): FlatWorldLocation {
    return FlatWorldLocationImpl(world, x, z)
}
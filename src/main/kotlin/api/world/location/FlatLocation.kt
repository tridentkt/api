package trident.api.world.location

interface FlatLocation {
    var x: Double
    var z: Double
}

data class FlatLocationImpl(
        override var x: Double,
        override var z: Double
) : FlatLocation

inline fun flatLocation(x: Double, z: Double): FlatLocation {
    return FlatLocationImpl(x, z)
}
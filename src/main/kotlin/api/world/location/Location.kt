package trident.api.world.location

interface Location : FlatLocation {
    override var x: Double
    var y: Double
    override var z: Double
}

data class LocationImpl(
        override var x: Double,
        override var y: Double,
        override var z: Double
) : Location

inline fun location(x: Double, y: Double, z: Double): Location {
    return LocationImpl(x, y, z)
}
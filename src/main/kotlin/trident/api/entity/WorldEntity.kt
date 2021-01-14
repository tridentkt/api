package trident.api.entity

import trident.api.world.location.WorldLocation

interface WorldEntity : Entity {
    var location: WorldLocation

    // TODO: Type this properly.
    var velocity: Nothing
}
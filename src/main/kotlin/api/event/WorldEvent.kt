package trident.api.event

import trident.api.world.World

interface WorldEvent : Event {
    val world: World
}
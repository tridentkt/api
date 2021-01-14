package trident.api.event.world

import trident.api.event.Event
import trident.api.world.World

interface WorldEvent<E : WorldEvent<E>> : Event<E> {
    val world: World
}
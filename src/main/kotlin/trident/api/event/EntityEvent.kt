package trident.api.event

import trident.api.entity.Entity

interface EntityEvent<E : EntityEvent<E>> : Event<E> {
    val entity: Entity
}
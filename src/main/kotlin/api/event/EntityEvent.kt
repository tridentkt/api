package trident.api.event

import trident.api.entity.Entity

interface EntityEvent : Event {
    val entity: Entity
}
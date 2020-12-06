package trident.api.entity

interface RideableEntity : Entity {
    val passengers: MutableSet<Entity>
}
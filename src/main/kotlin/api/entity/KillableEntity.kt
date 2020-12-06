package trident.api.entity

interface KillableEntity : Entity {
    var health: Int

    val isDead: Boolean

    fun kill()
}
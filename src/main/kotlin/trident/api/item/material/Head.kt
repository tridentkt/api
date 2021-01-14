package trident.api.item.material

import java.util.*

sealed class Head(name: String) : Material {
    object Zombie : Head("Zombie")

    object Creeper : Head("Creeper")

    object Steve : Head("Player")

    class Player(name: String, val uuid: UUID) : Head("$name's")

    override val defaultName = "$name Head"
    override val modelData: Int
        get() = TODO("Not yet implemented")
    override val maxStackSize: Int
        get() = 64
}
package trident.api.world

interface WorldLoader {
    fun load(name: String): World

    fun loadAll(): List<World>

    fun save(world: World)
}
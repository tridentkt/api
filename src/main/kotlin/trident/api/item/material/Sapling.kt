package trident.api.item.material

class Sapling(val type: WoodType) : Material, FlammableMaterial, BurnableMaterial {
    override val defaultName = type.title + " Sapling"
    override val modelData: Int
        get() = TODO("Not yet implemented")
    override val maxStackSize: Int
        get() = 64
}
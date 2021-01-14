package trident.api.item.material

class Planks(val type: WoodType) : Material, FlammableMaterial, BurnableMaterial, SolidMaterial {
    override val defaultName = type.title + " Planks"
    override val modelData: Int
        get() = TODO("Not yet implemented")
    override val maxStackSize: Int
        get() = 64
}
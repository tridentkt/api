package trident.api.item.material

interface DurableMaterial : Material {
    val maxDurability: Int

    var durability: Int
}
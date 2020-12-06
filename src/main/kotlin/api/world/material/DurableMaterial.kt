package trident.api.world.material

interface DurableMaterial : Material {
    val maxDurability: Int

    var durability: Int
}
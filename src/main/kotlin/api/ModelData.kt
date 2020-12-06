package trident.api

sealed class ModelData {
    class Minecraft(val itemId: Int) : ModelData()

    class Custom(val int: Int) : ModelData()
}
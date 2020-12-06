package trident.api.world.material

import trident.api.ModelData
import trident.api.dsl.item
import trident.api.entity.player.Player
import trident.api.world.block.Block
import trident.nbt.tag.NbtCompound

class Anvil(var health: AnvilHealth) : GravitationalMaterial {
    override val blastResistance
        get() = 1200.0f
    override val hardness
        get() = 5.0f

    override fun dropItem(block: Block<out BlockMaterial>, player: Player, shouldRetainNBT: Boolean) = item(this)

    override val defaultName
        get() = "Anvil"
    override val modelData
        get() = ModelData.Minecraft(145)
    override val maxStackSize
        get() = TODO("Not yet implemented")
    override val companion: MaterialCompanion<out Material>
        get() = TODO("Not yet implemented")

    override fun NbtCompound.write() {
        TODO("Not yet implemented")
    }
}
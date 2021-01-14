package trident.api.item.material

import trident.api.ModelData
import trident.api.dsl.item
import trident.api.entity.player.Player
import trident.api.world.block.Block
import trident.nbt.tag.NbtBoolean
import trident.nbt.tag.NbtCompound

class ActivatorRail(override var isPowering: Boolean) : TranslucentMaterial, RedstonePoweredMaterial {
    override val defaultName
        get() = "Activator Rail"
    override val modelData
        get() = ModelData.Minecraft(126)
    override val maxStackSize
        get() = 64
    override val companion
        get() = Companion

    override fun NbtCompound.write() {
        "IsPowered" - false
    }

    override val blastResistance: Float
        get() = 0.7f
    override val hardness: Float
        get() = 0.7f

    override fun dropItem(block: Block<out BlockMaterial>, player: Player, shouldRetainNBT: Boolean) = item(this) {
        if (!shouldRetainNBT) {
            isPowering = false
        }
    }

    companion object : MaterialCompanion<ActivatorRail> {
        override val id
            get() = "activator_rail"

        override fun NbtCompound.read(): ActivatorRail {
            return ActivatorRail(get(NbtBoolean, "IsPowering"))
        }

        override fun makeMaterial(sub: String?): ActivatorRail {
            return ActivatorRail(false)
        }
    }
}
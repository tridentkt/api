package trident.api.item.material

import trident.api.dsl.item
import trident.api.entity.player.Player
import trident.nbt.NBTCompound
import trident.api.world.block.Block

data class Wool(val color: DyeColor) : Material, FlammableMaterial, BurnableMaterial, SolidMaterial {
    override val blastResistance: Float
        get() = 0.8f
    override val hardness: Float
        get() = 0.8f

    override fun dropItem(block: Block<out BlockMaterial>, player: Player, shouldRetainNBT: Boolean)
            = item(this)

    override val defaultName
        get() = color.title + " Wool"
    override val modelData: Int
        get() = 1
    override val maxStackSize
        get() = 64

    override fun write(nbt: NBTCompound) {
        TODO("Not yet implemented")
    }
}
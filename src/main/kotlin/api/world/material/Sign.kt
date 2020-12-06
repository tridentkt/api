package trident.api.world.material

import trident.api.dsl.item
import trident.api.entity.player.Player
import trident.nbt.NBTCompound
import trident.api.world.block.Block

class Sign(
        var type: WoodType,
        var line1: String,
        var line2: String,
        var line3: String,
        var line4: String
) : BlockMaterial {
    override val defaultName
        get() = type.title + " Sign"
    override val modelData: Int
        get() = TODO("Not yet implemented")
    override val maxStackSize: Int
        get() = 64

    override fun write(nbt: NBTCompound) {
        TODO("Not yet implemented")
    }

    override val blastResistance: Float
        get() = TODO("Not yet implemented")
    override val hardness: Float
        get() = TODO("Not yet implemented")

    override fun dropItem(block: Block<out BlockMaterial>, player: Player, shouldRetainNBT: Boolean) = item(this) {
        if (!shouldRetainNBT) {
            line1 = ""
            line2 = ""
            line3 = ""
            line4 = ""
        }
    }
}
package trident.api.item.material

import trident.api.entity.player.Player
import trident.api.world.block.Block
import trident.api.item.Item

interface BlockMaterial : Material {
    val blastResistance: Float

    val hardness: Float

    fun dropItem(block: Block<out BlockMaterial>, player: Player, shouldRetainNBT: Boolean): Item<out Material>
}
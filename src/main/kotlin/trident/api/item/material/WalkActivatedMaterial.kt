package trident.api.item.material

import trident.api.entity.player.Player

interface WalkActivatedMaterial : BlockMaterial {
    fun walk(player: Player)
}
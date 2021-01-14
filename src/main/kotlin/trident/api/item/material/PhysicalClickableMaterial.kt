package trident.api.item.material

import trident.api.entity.player.Player

interface PhysicalClickableMaterial : BlockMaterial {
    fun physicallyLeftClick(player: Player)

    fun physicallyRightClick(player: Player)
}
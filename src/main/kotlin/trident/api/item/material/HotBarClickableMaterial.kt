package trident.api.item.material

import trident.api.entity.player.Player

interface HotBarClickableMaterial : Material {
    fun leftClick(player: Player)

    fun rightClick(player: Player)
}
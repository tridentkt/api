package trident.api.network.packet.client.ingame.player

import trident.api.entity.player.Hand
import trident.api.entity.player.InteractAction
import trident.api.network.packet.ClientPacket

interface PlayerInteractEntityClientPacket : ClientPacket {
    val entityId: Int
    val action: InteractAction
    val targetX: Float
    val targetY: Float
    val targetZ: Float
    val hand: Hand
}
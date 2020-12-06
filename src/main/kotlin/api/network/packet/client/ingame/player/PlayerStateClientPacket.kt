package trident.api.network.packet.client.ingame.player

import trident.api.entity.player.PlayerState
import trident.api.network.packet.ClientPacket

interface PlayerStateClientPacket : ClientPacket {
    val entityId: Int
    val state: PlayerState
    val jumpBoost: Int
}
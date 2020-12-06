package trident.api.network.packet.client.ingame.player

import trident.api.entity.player.Hand
import trident.api.network.packet.ClientPacket

interface PlayerSwingArmClientPacket : ClientPacket {
    val hand: Hand
}
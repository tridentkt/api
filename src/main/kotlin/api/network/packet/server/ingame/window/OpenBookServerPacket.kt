package trident.api.network.packet.server.ingame.window

import trident.api.entity.player.Hand
import trident.api.network.packet.ServerPacket

interface OpenBookServerPacket : ServerPacket {
    val hand: Hand
}
package trident.api.network.packet.client.ingame.world

import trident.api.network.packet.ClientPacket

interface SteerBoatClientPacket : ClientPacket {
    val rightPaddleTurning: Boolean
    val leftPaddleTurning: Boolean
}
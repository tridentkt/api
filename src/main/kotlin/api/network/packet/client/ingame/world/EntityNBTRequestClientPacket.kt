package trident.api.network.packet.client.ingame.world

import trident.api.network.packet.ClientPacket

interface EntityNBTRequestClientPacket : ClientPacket {
    val transactionId: Int
    val entityId: Int
}
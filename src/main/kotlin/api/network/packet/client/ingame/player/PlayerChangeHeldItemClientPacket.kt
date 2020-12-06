package trident.api.network.packet.client.ingame.player

import trident.api.network.packet.ClientPacket

interface PlayerChangeHeldItemClientPacket : ClientPacket {
    val slot: Int
}
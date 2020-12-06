package trident.api.network.packet.client.ingame.world

import trident.api.network.packet.ClientPacket

interface TeleportConfirmClientPacket : ClientPacket {
    val id: Int
}
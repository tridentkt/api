package trident.api.network.packet.client.ingame

import trident.api.network.packet.ClientPacket

interface KeepAliveClientPacket : ClientPacket {
    val pingId: Long
}
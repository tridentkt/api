package trident.api.network.packet.client.status

import trident.api.network.packet.ClientPacket

interface StatusPingClientPacket : ClientPacket {
    val pingTime: Long
}
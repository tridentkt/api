package trident.api.network.packet.client.handshake

import trident.api.network.packet.ClientPacket

interface HandshakeClientPacket : ClientPacket {
    val hostname: String

    val port: Int
}
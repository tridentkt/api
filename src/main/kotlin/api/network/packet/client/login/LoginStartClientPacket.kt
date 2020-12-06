package trident.api.network.packet.client.login

import trident.api.network.packet.ClientPacket

interface LoginStartClientPacket : ClientPacket {
    val username: String
}
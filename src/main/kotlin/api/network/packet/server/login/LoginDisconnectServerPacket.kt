package trident.api.network.packet.server.login

import trident.api.network.packet.ServerPacket

interface LoginDisconnectServerPacket : ServerPacket {
    val reason: String
}
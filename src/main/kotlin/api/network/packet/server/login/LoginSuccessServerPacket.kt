package trident.api.network.packet.server.login

import trident.api.network.GameProfile
import trident.api.network.packet.ServerPacket

interface LoginSuccessServerPacket : ServerPacket {
    val gameProfile: GameProfile
}
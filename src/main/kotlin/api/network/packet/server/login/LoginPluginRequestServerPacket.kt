package trident.api.network.packet.server.login

import trident.api.network.packet.ServerPacket

interface LoginPluginRequestServerPacket : ServerPacket {
    val messageId: Int

    val channel: String

    val data: ByteArray
}
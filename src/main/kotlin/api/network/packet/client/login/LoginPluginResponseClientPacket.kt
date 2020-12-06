package trident.api.network.packet.client.login

import trident.api.network.packet.ClientPacket

interface LoginPluginResponseClientPacket : ClientPacket {
    val messageId: Int

    val data: ByteArray
}
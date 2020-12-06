package trident.api.network.packet.client.login

import trident.api.network.packet.ClientPacket

interface EncryptionResponseClientPacket : ClientPacket {
    val sharedKey: ByteArray

    val token: ByteArray
}

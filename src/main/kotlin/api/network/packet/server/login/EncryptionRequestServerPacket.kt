package trident.api.network.packet.server.login

import trident.api.network.packet.ServerPacket
import java.security.PublicKey

interface EncryptionRequestServerPacket : ServerPacket {
    val serverId: String

    val publicKey: PublicKey

    val token: ByteArray
}
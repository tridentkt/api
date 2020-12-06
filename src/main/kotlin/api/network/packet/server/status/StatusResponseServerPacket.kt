package trident.api.network.packet.server.status

import trident.api.network.GameProfile
import trident.api.network.packet.ServerPacket
import java.util.Base64

interface StatusResponseServerPacket : ServerPacket {
    /**
     * Name of the version. e.g. 1.15.2, 1.12.1
     */
    val versionName: String

    /**
     * Protocol of the version. e.g. 485, 535
     */
    val versionProtocol: Int

    /**
     * The maximum amount of players the server can allow.
     */
    val maxPlayers: Int

    /**
     * The players online.
     */
    val players: List<GameProfile>

    /**
     * The description of the server, A.K.A. the MOTD.
     */
    val description: String

    /**
     * The icon of the server in Base-64 bytes.
     * @see Base64
     */
    val icon: ByteArray
}
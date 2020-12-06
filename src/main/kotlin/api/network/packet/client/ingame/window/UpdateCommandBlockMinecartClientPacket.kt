package trident.api.network.packet.client.ingame.window

import trident.api.network.packet.ClientPacket

interface UpdateCommandBlockMinecartClientPacket : ClientPacket {
    val entityId: Int
    val command: String
    val doesTrackOutput: Boolean
}
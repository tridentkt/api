package trident.api.network.packet.client.ingame

import trident.api.network.packet.ClientPacket

interface PluginMessageClientPacket : ClientPacket {
    val channel: String

    val data: ByteArray
}
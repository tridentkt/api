package trident.api.network.packet.client.ingame

import trident.api.entity.player.ResourcePackStatus
import trident.api.network.packet.ClientPacket

interface ResourcePackStatusClientPacket : ClientPacket {
    val status: ResourcePackStatus
}
package trident.api.network.packet.client.ingame.window

import trident.api.network.packet.ClientPacket
import trident.api.world.location.Location

interface UpdateJigsawBlockClientPacket : ClientPacket {
    val location: Location
    val attachmentType: String
    val targetPool: String
    val finalState: String
}
package trident.api.network.packet.client.ingame.world

import trident.api.network.packet.ClientPacket
import trident.api.world.location.Location

interface UpdateSignClientPacket : ClientPacket {
    val location: Location
    val lines: Array<String>
}
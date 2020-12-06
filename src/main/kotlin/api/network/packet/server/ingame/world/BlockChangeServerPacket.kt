package trident.api.network.packet.server.ingame.world

import trident.api.network.packet.ServerPacket
import trident.api.world.location.Location

interface BlockChangeServerPacket : ServerPacket {
    val location: Location
}
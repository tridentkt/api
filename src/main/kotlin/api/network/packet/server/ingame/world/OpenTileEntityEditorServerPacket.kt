package trident.api.network.packet.server.ingame.world

import trident.api.network.packet.ServerPacket
import trident.api.world.location.Location

interface OpenTileEntityEditorServerPacket : ServerPacket {
    val location: Location
}
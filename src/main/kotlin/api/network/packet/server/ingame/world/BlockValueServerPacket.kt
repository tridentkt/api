package trident.api.network.packet.server.ingame.world

import trident.api.network.packet.ServerPacket
import trident.api.world.location.Location

interface BlockValueServerPacket : ServerPacket {
    val location: Location
    // TODO: val type: BlockValueType
    // TODO: val value: BlockValue
    val blockId: Int
}
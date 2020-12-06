package trident.api.network.packet.server.ingame.world

import trident.api.network.packet.ServerPacket

interface MapDataServerPacket : ServerPacket {
    val mapId: Int
    val scale: Byte
    val trackingPosition: Boolean
    val locked: Boolean
    // TODO: val icons: Array<MapIcon>
    // TODO: val data: MapData
}
package trident.api.network.packet.server.ingame.world

import trident.api.network.packet.ServerPacket

interface UpdateLightServerPacket : ServerPacket {
    val x: Int
    val z: Int
    // TODO: val skyLight: Array<NibbleArray3d>
    // TODO: val blockLight: Array<NibbleArray3d>
}
package trident.api.network.packet.server.ingame.world

import trident.api.network.packet.ServerPacket
import trident.api.world.WorldBorderAction

interface WorldBorderServerPacket : ServerPacket {
    val action: WorldBorderAction
    val newSize: Double
    val oldSize: Double
    val lerpTime: Long
    val newCenterX: Double
    val newCenterZ: Double
    val newAbsoluteMaxSize: Int
    val warningTime: Int
    val warningBlocks: Int
}
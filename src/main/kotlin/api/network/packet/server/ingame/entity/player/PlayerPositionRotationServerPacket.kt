package trident.api.network.packet.server.ingame.entity.player

import trident.api.network.packet.ServerPacket
import trident.api.world.location.LocationElement

interface PlayerPositionRotationServerPacket : ServerPacket {
    val x: Double
    val y: Double
    val z: Double
    val yaw: Float
    val pitch: Float
    val teleportId: Int
    val relative: List<LocationElement>
}
package trident.api.network.packet.server.ingame.entity.player

import trident.api.entity.RotationOrigin
import trident.api.network.packet.ServerPacket

interface PlayerFacingServerPacket : ServerPacket {
    val origin: RotationOrigin
    val x: Double
    val y: Double
    val z: Double
    val targetEntityId: Int
    val targetEntityOrigin: RotationOrigin
}
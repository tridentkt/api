package trident.api.network.packet.server.ingame.world

import trident.api.network.packet.ServerPacket
import trident.api.world.location.Location

interface ExplosionServerPacket : ServerPacket {
    val x: Float
    val y: Float
    val z: Float
    val radius: Float
    val explosions: List<Location>
    val pushX: Float
    val pushY: Float
    val pushZ: Float
}
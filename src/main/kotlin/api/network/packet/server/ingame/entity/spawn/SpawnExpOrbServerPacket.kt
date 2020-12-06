package trident.api.network.packet.server.ingame.entity.spawn

import trident.api.network.packet.ServerPacket

interface SpawnExpOrbServerPacket : ServerPacket {
    val entityId: Int
    val x: Double
    val y: Double
    val z: Double
    val exp: Short
}
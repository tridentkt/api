package trident.api.network.packet.server.ingame.world

import trident.api.network.packet.ServerPacket
import trident.api.particle.Particle

interface SpawnParticleServerPacket : ServerPacket {
    val particle: Particle
    val longDistance: Boolean
    val x: Double
    val y: Double
    val z: Double
    val offsetX: Float
    val offsetY: Float
    val offsetZ: Float
    val velocityOffset: Float
    val amount: Int
}
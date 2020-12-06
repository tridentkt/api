package trident.api.network.packet.server.ingame.world

import trident.api.network.packet.ServerPacket
import trident.api.sound.MinecraftSound
import trident.api.sound.Sound
import trident.api.sound.SoundType

interface PlayMinecraftSoundServerPacket : ServerPacket {
    val sound: MinecraftSound
    val type: SoundType
    val x: Double
    val y: Double
    val z: Double
    val volume: Float
    val pitch: Float
}
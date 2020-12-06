package trident.api.network.packet.server.ingame.world

import trident.api.network.packet.ServerPacket
import trident.api.sound.Sound
import trident.api.sound.SoundType

interface PlaySoundServerPacket : ServerPacket {
    val sound: Sound
    val type: SoundType
    val x: Double
    val y: Double
    val z: Double
    val volume: Float
    val pitch: Float
}
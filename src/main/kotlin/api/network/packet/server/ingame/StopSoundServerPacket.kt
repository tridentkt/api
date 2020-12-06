package trident.api.network.packet.server.ingame

import trident.api.network.packet.ServerPacket
import trident.api.sound.Sound
import trident.api.sound.SoundType

interface StopSoundServerPacket : ServerPacket {
    val type: SoundType
    val sound: Sound
}
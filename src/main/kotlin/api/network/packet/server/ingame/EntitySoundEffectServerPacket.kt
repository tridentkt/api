package trident.api.network.packet.server.ingame

import trident.api.network.packet.ServerPacket
import trident.api.sound.SoundType

interface EntitySoundEffectServerPacket : ServerPacket {
    val soundId: Int
    val soundType: SoundType
    val entityId: Int
    val volume: Float
    val pitch: Float
}
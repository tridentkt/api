package trident.api.network.packet.server.ingame.entity.player

import trident.api.network.packet.ServerPacket

interface PlayerSetExperienceServerPacket : ServerPacket {
    var experience: Float
    var level: Int
    var totalExperience: Int
}
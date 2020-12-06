package trident.api.network.packet.server.ingame

import trident.api.game.Difficulty
import trident.api.network.packet.ServerPacket

interface DifficultyServerPacket : ServerPacket {
    val difficulty: Difficulty
    val difficultyLocked: Boolean
}
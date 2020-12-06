package trident.api.network.packet.client.ingame

import trident.api.game.Difficulty
import trident.api.network.packet.ClientPacket

interface SetDifficultyClientPacket : ClientPacket {
    val difficulty: Difficulty
}
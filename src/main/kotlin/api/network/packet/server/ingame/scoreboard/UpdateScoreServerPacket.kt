package trident.api.network.packet.server.ingame.scoreboard

import trident.api.network.packet.ServerPacket
import trident.api.ui.ScoreboardAction

interface UpdateScoreServerPacket : ServerPacket {
    val entry: String
    val action: ScoreboardAction
    val objective: String
    val value: Int
}
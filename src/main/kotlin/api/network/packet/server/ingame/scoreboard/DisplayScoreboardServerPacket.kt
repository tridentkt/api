package trident.api.network.packet.server.ingame.scoreboard

import trident.api.network.packet.ServerPacket
import trident.api.ui.ScoreboardPosition

interface DisplayScoreboardServerPacket : ServerPacket {
    val position: ScoreboardPosition
    val name: String
}
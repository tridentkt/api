package trident.api.network.packet.server.ingame.scoreboard

import trident.api.message.Message
import trident.api.network.packet.ServerPacket

interface ScoreboardObjectiveServerPacket : ServerPacket {
    val name: String
    // TODO: val action: ObjectiveAction
    val displayName: Message
    // TODO: val type: ScoreType
}
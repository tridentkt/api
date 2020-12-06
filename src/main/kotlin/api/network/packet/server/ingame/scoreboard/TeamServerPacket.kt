package trident.api.network.packet.server.ingame.scoreboard

import trident.api.message.Message
import trident.api.network.packet.ServerPacket

interface TeamServerPacket : ServerPacket {
    val teamName: String
    // TODO: val action: TeamAction
    val displayName: Message
    val prefix: Message
    val suffix: Message
    val isFriendlyFire: Boolean
    val isViewingInvisibleTeamMates: Boolean
    // TODO: val nameTagVisibility: NameTagVisibility
    // TODO: val collisionRule: CollisionRule
    // TODO: val color: TeamColor
    val players: Array<String>
}
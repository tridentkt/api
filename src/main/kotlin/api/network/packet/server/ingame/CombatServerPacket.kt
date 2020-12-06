package trident.api.network.packet.server.ingame

import trident.api.message.Message
import trident.api.entity.player.CombatState
import trident.api.network.packet.ServerPacket

interface CombatServerPacket : ServerPacket {
    val combatState: CombatState
    val entityId: Int
    val duration: Int
    val playerId: Int
    val message: Message
}
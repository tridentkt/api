package trident.api.network.packet.server.ingame.entity.player

import trident.api.network.packet.ServerPacket
import trident.api.entity.player.PlayerAction
import trident.api.world.location.Location

interface PlayerActionActionServerPacket : ServerPacket {
    val action: PlayerAction
    val successful: Boolean
    val location: Location
    val newState: Int
}
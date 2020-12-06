package trident.api.network.packet.client.ingame.player

import trident.api.entity.player.PlayerAction
import trident.api.network.packet.ClientPacket
import trident.api.world.block.BlockFace
import trident.api.world.location.Location

interface PlayerActionClientPacket : ClientPacket {
    val action: PlayerAction
    val location: Location
    val face: BlockFace
}
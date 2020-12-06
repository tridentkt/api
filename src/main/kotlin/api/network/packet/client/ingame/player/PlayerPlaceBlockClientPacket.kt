package trident.api.network.packet.client.ingame.player

import trident.api.entity.player.Hand
import trident.api.network.packet.ClientPacket
import trident.api.world.block.BlockFace
import trident.api.world.location.Location

interface PlayerPlaceBlockClientPacket : ClientPacket {
    val location: Location
    val face: BlockFace
    val hand: Hand
    val cursorX: Float
    val cursorY: Float
    val cursorZ: Float
    val insideBlock: Boolean
}
package trident.api.network.packet.server.ingame.world

import trident.api.network.packet.ServerPacket
import trident.api.world.block.BlockBreakStage
import trident.api.world.location.Location

interface BlockBreakAnimationServerPacket : ServerPacket {
    val breakerEntityId: Int
    val location: Location
    val stage: BlockBreakStage
}
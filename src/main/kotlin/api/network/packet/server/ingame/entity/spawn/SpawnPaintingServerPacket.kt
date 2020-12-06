package trident.api.network.packet.server.ingame.entity.spawn

import trident.api.world.block.PaintingType
import trident.api.network.packet.ServerPacket
import trident.api.world.block.BlockFace
import trident.api.world.location.Location
import java.util.*

interface SpawnPaintingServerPacket : ServerPacket {
    val entityId: Int
    val uuid: UUID
    val paintingType: PaintingType
    val location: Location
    val direction: BlockFace
}
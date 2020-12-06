package trident.api.network.packet.server.ingame.world

import trident.nbt.NBTCompound
import trident.api.network.packet.ServerPacket
import trident.api.world.block.UpdatedTileType
import trident.api.world.location.Location

interface UpdateTileEntityServerPacket : ServerPacket {
    val location: Location
    val type: UpdatedTileType
    val nbt: NBTCompound
}
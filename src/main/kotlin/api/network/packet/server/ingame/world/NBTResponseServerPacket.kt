package trident.api.network.packet.server.ingame.world

import trident.nbt.NBTCompound
import trident.api.network.packet.ServerPacket

interface NBTResponseServerPacket : ServerPacket {
    val transactionId: Int
    val nbt: NBTCompound
}
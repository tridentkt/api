package trident.api.network.packet.server.ingame.entity

import trident.api.entity.player.EquipmentSlot
import trident.api.world.item.Item
import trident.api.network.packet.ServerPacket

interface EntityEquipmentServerPacket : ServerPacket {
    val entityId: Int
    val slot: EquipmentSlot
    val item: Item
}
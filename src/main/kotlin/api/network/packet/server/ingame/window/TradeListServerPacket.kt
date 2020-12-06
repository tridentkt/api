package trident.api.network.packet.server.ingame.window

import trident.api.network.packet.ServerPacket

interface TradeListServerPacket : ServerPacket {
    val windowId: Int
    // TODO: val trades: Array<VillagerTrade>
    val villagerLevel: Int
    val experience: Int
    val regularVillager: Boolean
    val canRestock: Boolean
}
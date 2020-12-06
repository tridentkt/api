package trident.api.network.packet.server.ingame

import trident.api.network.packet.ServerPacket
import trident.api.statistic.Statistic

interface StatisticsServerPacket : ServerPacket {
    val statistics: Map<Statistic, Int>
}
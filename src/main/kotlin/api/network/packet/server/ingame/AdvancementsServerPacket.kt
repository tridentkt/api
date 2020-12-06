package trident.api.network.packet.server.ingame

import trident.api.advancement.Advancement
import trident.api.network.packet.ServerPacket

interface AdvancementsServerPacket : ServerPacket {
    val reset: Boolean
    val advancements: Array<Advancement>
    val removedAdvancements: Array<String>
    val progress: Map<String, Map<String, Long>>
}
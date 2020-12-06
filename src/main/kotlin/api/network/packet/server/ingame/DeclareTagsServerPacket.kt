package trident.api.network.packet.server.ingame

import trident.api.network.packet.ServerPacket

interface DeclareTagsServerPacket : ServerPacket {
    val blockTags: Map<String, IntArray>

    val itemTags: Map<String, IntArray>

    val fluidTags: Map<String, IntArray>

    val entityTags: Map<String, IntArray>
}
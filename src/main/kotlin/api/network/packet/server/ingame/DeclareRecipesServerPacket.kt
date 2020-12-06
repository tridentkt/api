package trident.api.network.packet.server.ingame

import trident.api.advancement.Recipe
import trident.api.network.packet.ServerPacket

interface DeclareRecipesServerPacket : ServerPacket {
    val recipes: Array<Recipe>
}
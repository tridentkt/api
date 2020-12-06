package trident.api.network.packet.client.ingame.world

import trident.api.network.packet.ClientPacket
import trident.api.world.location.Location

interface BlockNBTRequestClientPacket : ClientPacket {
    val transactionId: Int
    val location: Location
}
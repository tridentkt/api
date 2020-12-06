package trident.api.network.packet.client.ingame.window

import trident.api.network.packet.ClientPacket

interface MoveItemToHotbarClientPacket : ClientPacket {
    val slot: Int
}
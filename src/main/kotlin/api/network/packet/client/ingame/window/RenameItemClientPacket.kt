package trident.api.network.packet.client.ingame.window

import trident.api.network.packet.ClientPacket

interface RenameItemClientPacket : ClientPacket {
    val name: String
}
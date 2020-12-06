package trident.api.network.packet.client.ingame.window

import trident.api.network.packet.ClientPacket

interface SetBeaconEffectClientPacket : ClientPacket {
    val primaryEffect: Int
    val secondaryEffect: Int
}
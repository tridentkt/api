package trident.api.network.packet.client.ingame.world

import trident.api.network.packet.ClientPacket

interface SteerVehicleClientPacket : ClientPacket {
    val sideways: Float
    val forward: Float
    val jump: Boolean
    val dismount: Boolean
}
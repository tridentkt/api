package trident.api.network.packet.server.ingame

import trident.api.network.packet.ServerPacket

interface SwitchCameraServerPacket : ServerPacket {
    val cameraEntityId: Int
}
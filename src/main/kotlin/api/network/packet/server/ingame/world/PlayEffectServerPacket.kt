package trident.api.network.packet.server.ingame.world

import trident.api.network.packet.ServerPacket
import trident.api.world.location.Location

interface PlayEffectServerPacket : ServerPacket {
    // TODO: val effect: WorldEffect
    val location: Location
    // TODO: val data: WorldEffectData
    val broadcast: Boolean
}
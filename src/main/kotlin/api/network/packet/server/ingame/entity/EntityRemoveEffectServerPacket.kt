package trident.api.network.packet.server.ingame.entity

import trident.api.effect.Effect
import trident.api.network.packet.ServerPacket
import kotlin.reflect.KClass

interface EntityRemoveEffectServerPacket : ServerPacket {
    val entityId: Int
    val effect: KClass<out Effect>
}
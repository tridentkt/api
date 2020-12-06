package trident.api.network.packet.server.ingame

import trident.api.message.Message
import trident.api.network.packet.ServerPacket
import trident.api.ui.BossBar
import trident.api.ui.BossBarAction
import java.util.UUID

interface BossBarServerPacket : ServerPacket {
    val uuid: UUID

    val action: BossBarAction

    val title: Message

    val health: Float

    val color: BossBar.Color

    val style: BossBar.Style

    val darkenSky: Boolean

    val playEndMusic: Boolean

    val showFog: Boolean
}
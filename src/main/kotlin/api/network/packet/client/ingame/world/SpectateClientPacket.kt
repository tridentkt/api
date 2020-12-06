package trident.api.network.packet.client.ingame.world

import trident.api.network.packet.ClientPacket
import java.util.UUID

interface SpectateClientPacket : ClientPacket {
    val target: UUID
}
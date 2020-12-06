package trident.api.network.packet.client.ingame.window

import trident.api.world.block.CommandBlockMode
import trident.api.network.packet.ClientPacket
import trident.api.world.location.Location

interface UpdateCommandBlockClientPacket : ClientPacket {
    val location: Location
    val command: String
    val mode: CommandBlockMode
    val doesTrackOutput: Boolean
    val isConditional: Boolean
    val isAutomatic: Boolean
}
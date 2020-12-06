package trident.api.network.packet.server.ingame

import trident.api.command.Command
import trident.api.network.packet.ServerPacket

interface DeclareCommandsServerPacket : ServerPacket {
    val commands: Set<Command>
    val firstNodeIndex: Int
}
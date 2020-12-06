package trident.api.network.packet.client.ingame

import trident.api.network.packet.ClientPacket

interface LockDifficultyClientPacket : ClientPacket {
    val locked: Boolean
}
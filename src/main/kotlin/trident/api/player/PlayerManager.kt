package trident.api.player

import trident.api.entity.player.Player
import java.util.*
import kotlin.NoSuchElementException

interface PlayerManager : Set<Player> {
    fun fromUsername(username: String): Player

    fun fromUUID(uuid: UUID): Player
}
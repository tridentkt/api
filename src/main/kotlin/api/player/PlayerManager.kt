package trident.api.player

import trident.api.entity.player.Player
import java.util.*
import kotlin.NoSuchElementException

interface PlayerManager : Set<Player>

/**
 * @throws NoSuchElementException if a player with the specified name is not online.
 */
fun PlayerManager.fromUsername(name: String): Player {
    return find {
        it.name == name
    } ?: throw NoSuchElementException("A player with a username of \"$name\" is not online.")
}

/**
 * @throws NoSuchElementException if a player with the specified UUID is not online.
 */
fun PlayerManager.fromUUID(uuid: UUID): Player {
    return find {
        it.uuid == uuid
    } ?: throw NoSuchElementException("A player with a UUID of \"$uuid\" is not online.")
}
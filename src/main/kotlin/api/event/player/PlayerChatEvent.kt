package trident.api.event.player

import trident.api.entity.player.Player
import trident.api.event.CancellableEvent
import trident.api.server.Server
import java.lang.IllegalArgumentException
import java.util.*

open class PlayerChatEvent(override val entity: Player, var message: String) : PlayerEvent, CancellableEvent {
    override var isCancelled = false
    override val time = System.currentTimeMillis()

    var format = "<%1\$s> %2\$s"
        set(value) {
            try {
                value.format(player, message)
            } catch (ex: IllegalFormatException) {
                throw IllegalArgumentException("Invalid player chat format: $value")
            }

            field = value
        }
}
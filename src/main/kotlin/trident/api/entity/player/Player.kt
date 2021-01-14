package trident.api.entity.player

import trident.api.entity.CommandSender
import trident.api.entity.KillableEntity
import trident.api.entity.OfflinePlayer
import trident.api.exceptions.NonPremiumPlayerException
import java.util.*

interface Player : OfflinePlayer, CommandSender, KillableEntity {
    /**
     * The name of the player.
     */
    override val name: String

    /**
     * Gets the players Mojang UUID.
     *
     * @throws NonPremiumPlayerException if the player is not registered with Mojang.
     */
    val uuid: UUID

    /**
     * Is the player's account registered with Mojang.
     */
    val isPremium: Boolean

    /**
     * Bans the player from the server until a specified time.
     * @param message The message to be displayed when the players attempts to reconnect to the server.
     * @param time When (Unix-time) should the player be unbanned. -1 is forever.
     */
    fun ban(message: String, time: Long): Boolean

    /**
     * Unbans the player.
     *
     * @return `true` if the player was unbanned successfully. `false` is the player wasn't banned in the first place.
     */
    fun unban(): Boolean

    /**
     * Kicks the player from the server.
     */
    fun kick(message: String)

    val inventory: PlayerInventory

    var hunger: Int

    override var isOp: Boolean

    companion object
}
package trident.api.exceptions

import kotlin.RuntimeException

/**
 * This is used for cases where something only available in premium-players has been attempted top be accessed in the context of a non-premium player.
 */
class NonPremiumPlayerException : RuntimeException {
    constructor(): super()

    constructor(message: String): super(message)
}
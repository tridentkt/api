package trident.api

import trident.api.message.CodedMessage
import trident.api.text.Color

/**
 * @return a string with appropriately formatted colors and effects from the given receiver.
 * @see CodedMessage
 */
fun String.translateColors(character: Char = '&'): CodedMessage {
    return CodedMessage(character, this)
}

/**
 * @return the receiver represented as ticks in units of seconds.
 */
inline val Int.secondsAsTicks
    get() = this * 20

/**
 * @return the receiver represented as ticks in units of minutes.
 */
inline val Int.minutesAsTicks
    get() = this * 60.secondsAsTicks

/**
 * @return the receiver represented as ticks in units of hours.
 */
inline val Int.hoursAsTicks
    get() = this * 60.minutesAsTicks
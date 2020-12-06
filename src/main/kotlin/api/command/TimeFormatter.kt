@file:JvmName("TimeFormatter")
package trident.api.command

/**
 * This converts a [string] like "100s" or "20m" to milliseconds.
 *
 * Key:
 *  - `s` seconds
 *  - `m` minutes
 *  - `h` hours
 *  - `d` days
 *  - `w` weeks
 *  - `M` months
 *  - `y` years
 *
 * @return the string converted to time in milliseconds.
 * @throws IllegalArgumentException if the string is improperly formatted.
 */
@JvmName("toMilliseconds")
fun convertTimeToMilliseconds(string: String): Long {
    return string.dropLast(1).toLongOrNull()?.let {
        when (string.last()) {
            's' -> it * 1000
            'm' -> it * 1000 * 60
            'h' -> it * 1000 * 60 * 60
            'd' -> it * 1000 * 60 * 60 * 24
            'w' -> it * 1000 * 60 * 60 * 24 * 7
            'M' -> it * 1000 * 60 * 60 * 24 * 30
            'y' -> it * 1000 * 60 * 60 * 24 * 365
            else -> string.toLongOrNull()
        }
    } ?: throw IllegalArgumentException("Improperly formatted time string: \"$string\"")
}

/**
 * This converts a [string] like "100s" or "20m" to nanoseconds.
 *
 * @see convertTimeToMilliseconds
 */
@JvmName("toNanoseconds")
fun convertTimeToNanoseconds(string: String): Long {
    return convertTimeToMilliseconds(string) * 1000000L
}
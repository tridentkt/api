package trident.api

import trident.api.message.Message
import trident.api.message.SimpleMessage

fun MutableCollection<Message>.add(string: String) {
    add(SimpleMessage(string))
}

inline fun Error?.throwIfNotNull() = this?.let {
    throw it
}
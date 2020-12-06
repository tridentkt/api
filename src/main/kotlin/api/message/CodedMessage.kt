package trident.api.message

import trident.api.message.Message

class CodedMessage(val character: Char, val string: String) : Message {
    override fun toJson(): String {
        TODO("Not yet implemented")
    }
}
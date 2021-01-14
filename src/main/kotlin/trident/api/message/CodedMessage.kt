package trident.api.message

class CodedMessage(val character: Char, val string: String) : Message {
    override fun toJson(): String {
        TODO("Not yet implemented")
    }
}
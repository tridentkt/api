package trident.api.network

interface Network {
    val host: String

    val port: Int

    val sessions: MutableSet<NetworkSession>

    val isListening: Boolean

    fun close()
}
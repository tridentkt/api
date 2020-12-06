package trident.api.network

import trident.api.network.packet.Packet
import java.net.SocketAddress

// TODO: Improve this
interface NetworkSession {
    val host: String

    val port: Int

    val localAddress: SocketAddress

    val remoteAddress: SocketAddress

    var compressionThreshold: Int

    var connectTimeout: Int

    var readTimeout: Int

    val writeTimeout: Int

    val isConnected: Boolean

    fun send(packet: Packet)

    fun connect()

    fun connect(boolean: Boolean)

    fun disconnect(string: String)

    fun disconnect(string: String, throwable: Throwable)
}
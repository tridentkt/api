package trident.api

import trident.api.server.Server

interface Manager {
    val server: Server
}
package trident.api.event

import trident.api.server.Server

/**
 * This is the root interface for all Fountain events.
 */
interface Event {
    /**
     * This is the time (Unix-epoch) in milliseconds when the event was triggered.
     * @see System.currentTimeMillis
     */
    val time: Long
}
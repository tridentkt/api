package trident.api.event.player

import trident.api.event.Cancellable

interface PlayerChatEvent : PlayerEvent<PlayerChatEvent>, Cancellable {
    var message: String

    var format: String
}
package trident.api.event

interface CancellableEvent : Event {
    var isCancelled: Boolean
}
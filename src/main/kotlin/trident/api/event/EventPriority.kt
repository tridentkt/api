package trident.api.event

enum class EventPriority {
    Earliest,
    EarlyIgnoreCancelled,
    Early,
    DefaultIgnoreCancelled,
    Default,
    LateIgnoreCancelled,
    Late,
    LatestIgnoreCancelled,
    Latest,
    Monitor;

    companion object {
        internal val values = values()
    }
}
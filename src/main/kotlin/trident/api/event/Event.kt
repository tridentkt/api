package trident.api.event

interface Event<E : Event<E>> {
    val handlerList: HandlerList<E>
}
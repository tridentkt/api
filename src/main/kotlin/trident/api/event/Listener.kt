package trident.api.event

fun interface Listener<E : Event<E>> {
    fun E.on()
}
package trident.api.event

import trident.api.Manager
import trident.api.plugin.Plugin
import kotlin.reflect.KClass

interface EventManager : Manager {
    fun <E : Event<E>> findHandlerList(`class`: KClass<E>): HandlerList<E>

    fun <E : Event<E>> add(`class`: KClass<E>, plugin: Plugin?, listener: Listener<E>)

    fun <E : Event<E>> call(event: E)
}

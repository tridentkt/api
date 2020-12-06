package trident.api.event

import trident.api.plugin.Plugin
import kotlin.reflect.KClass

interface EventManager : MutableMap<KClass<out Event>, MutableList<RegisteredEventListener<out Event>>> {
    fun <E : Event> add(`class`: KClass<E>, plugin: Plugin?, callback: (E) -> Unit)

    fun <E : Event> call(event: E)
}

inline fun <reified E : Event> EventManager.listen(plugin: Plugin?, crossinline callback: (E) -> Unit) {
    add(E::class, plugin) {
        callback(it)
    }
}


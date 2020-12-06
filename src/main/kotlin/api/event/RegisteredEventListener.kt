package trident.api.event

import trident.api.plugin.Plugin
import kotlin.reflect.KClass

interface RegisteredEventListener<E : Event> : (E) -> Unit {
    val `class`: KClass<E>
    val plugin: Plugin?
}
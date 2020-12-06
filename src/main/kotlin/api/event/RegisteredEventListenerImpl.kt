package trident.api.event

import trident.api.plugin.Plugin
import kotlin.reflect.KClass

data class RegisteredEventListenerImpl<E : Event>(
        override val `class`: KClass<E>,
        override val plugin: Plugin?,
        val callback: (E) -> Unit
) : (E) -> Unit by callback, RegisteredEventListener<E>
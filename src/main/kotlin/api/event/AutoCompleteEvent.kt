package trident.api.event

import trident.api.command.autoCompletion.AutoCompleter
import trident.api.entity.CommandSender

open class AutoCompleteEvent(
        override val entity: CommandSender,
        val arguments: List<String>,
        val autoCompleter: AutoCompleter,
        val suggestions: List<String>
) : CancellableEvent, CommandSenderEvent {
    override var isCancelled = false
    override val time = System.currentTimeMillis()
}
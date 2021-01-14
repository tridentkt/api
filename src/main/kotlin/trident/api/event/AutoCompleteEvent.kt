package trident.api.event

import trident.api.command.autoCompletion.AutoCompleter
import trident.api.entity.CommandSender

interface AutoCompleteEvent<E : AutoCompleteEvent<E>> : CommandSenderEvent<E>, Cancellable {
    val autoCompleter: AutoCompleter

    var completions: List<String>
}
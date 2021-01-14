package trident.api.command.autoCompletion

import trident.api.entity.CommandSender

/**
 * This represents a command auto-completer.
 */
interface AutoCompleter {
    /**
     * This sends back a list of suggestions based on the [sender] and [arguments] being typed.
     *
     * @param sender the sender typing the command.
     * @param arguments the current arguments which have already been typed.
     *
     * @return suggestions for the next argument (based on the length of [arguments] usually).
     */
    fun getSuggestions(sender: CommandSender, arguments: List<String>): List<String>
}
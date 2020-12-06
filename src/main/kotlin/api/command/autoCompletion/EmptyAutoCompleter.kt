package trident.api.command.autoCompletion

import trident.api.entity.CommandSender

/**
 * This represents an auto completer which always returns an empty list of [String].
 */
object EmptyAutoCompleter : AutoCompleter {
    /**
     * @return an empty list of [String].
     */
    override fun complete(entity: CommandSender, arguments: List<String>): List<String> {
        return emptyList()
    }
}
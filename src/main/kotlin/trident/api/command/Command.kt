package trident.api.command

import trident.api.command.autoCompletion.AutoCompleter
import trident.api.entity.CommandSender
import trident.api.key.Keyed

interface Command : Keyed {
    /**
     * The label of the command. Used as so: /[label] ...args...
     */
    val label: String

    /**
     * The description of the command. Used in the help menu.
     */
    val description: String

    /**
     * The usage of the command. Used in the help menu.
     */
    val usage: String

    /**
     * The auto-completion provider for this command.
     */
    val autoCompleter: AutoCompleter

    val permission: String

    /**
     * This will be run each time the [label] matches the user-specified label.
     */
    fun execute(entity: CommandSender, args: List<String>)
}
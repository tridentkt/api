package trident.api.command

import trident.api.command.autoCompletion.AutoCompleter
import trident.api.entity.CommandSender

interface Command {
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

    /**
     * This will be run each time the [label] matches the user-specified label.
     */
    fun execute(entity: CommandSender, args: List<String>)
}

data class CommandImpl(
        override val label: String,
        override val description: String,
        override val usage: String,
        override val autoCompleter: AutoCompleter,
        private val executor: (CommandSender, List<String>) -> Unit
) : Command {
    override fun execute(entity: CommandSender, args: List<String>) {
        executor(entity, args)
    }
}

fun command(label: String, description: String, usage: String, autoCompleter: AutoCompleter, executor: (CommandSender, List<String>) -> Unit): Command {
    return CommandImpl(label, description, usage, autoCompleter, executor)
}
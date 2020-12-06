package trident.api.command

import trident.api.plugin.Plugin

data class RegisteredCommandImpl(
        override val plugin: Plugin,
        val command: Command
) : Command by command, RegisteredCommand


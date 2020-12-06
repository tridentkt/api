package trident.api.command

import trident.api.plugin.Plugin

interface RegisteredCommand : Command {
    val plugin: Plugin
}
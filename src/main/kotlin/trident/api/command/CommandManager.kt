package trident.api.command

import trident.api.plugin.Plugin

/**
 * This represents a manager for commands on the server.
 */
interface CommandManager : MutableSet<RegisteredCommand>
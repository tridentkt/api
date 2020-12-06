package trident.api.permission

import trident.api.LightMutableSet

class PermissionSet(
        var isOp: Boolean
) : LightMutableSet<String> {
    private val internal = mutableListOf<String>()

    override fun add(element: String): Boolean {
        return internal.add(element)
    }

    override fun iterator(): MutableIterator<String> {
        return internal.iterator()
    }

    override fun remove(element: String): Boolean {
        return internal
                .remove(element)
                .apply {
                    internal.filter { it.startsWith(element) }
                            .forEach { internal.remove(it) }
                }
    }

    override val size: Int
        get() = internal.size

    @ExperimentalStdlibApi
    override fun contains(element: String): Boolean {
        return isOp || element
                .split('.')
                .scanReduce { acc, s -> "$acc.$s" }
                .any(internal::contains)
    }
}
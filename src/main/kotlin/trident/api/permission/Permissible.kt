package trident.api.permission

interface Permissible {
    var isOp: Boolean

    val permissions: MutableSet<String>
}
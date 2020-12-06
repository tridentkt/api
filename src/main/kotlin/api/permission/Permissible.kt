package trident.api.permission

interface Permissible {
    val permissions: MutableSet<String>
}
package trident.api.permission

import kotlin.RuntimeException

class InvalidPermissionException(message: String) : RuntimeException(message)

val permissionRegex = "([a-z0-9_]+)|\\*".toRegex()
fun validatePermission(string: String): InvalidPermissionException? {
    val parts = string.split(".")
    parts.forEach {

    }

    return null
}
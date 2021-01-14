package trident.api

data class Version(
    val major: Int,
    val minor: Int,
    val patch: Int
) {
    override fun toString(): String {
        return "$major.$minor.$patch"
    }
}

fun String.toVersion(): Version {
    val strings = split(".")
    require(strings.size == 3) {
        "Invalid version format: \"$this\". There must be 2 dots separating 3 integers."
    }
    val ints = strings.map(String::toIntOrNull)
    require(ints.all { it != null }) {
        "Invalid version format: \"$this\". All the numbers must be integers."
    }
    return Version(ints[0]!!, ints[1]!!, ints[2]!!)
}
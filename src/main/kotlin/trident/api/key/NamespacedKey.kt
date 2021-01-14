package trident.api.key

data class NamespacedKey(
    val namespace: String,
    val key: String
) {
    private val value = "$namespace:$key"

    override fun toString() = value

    init {
        require(regex.matches(namespace) && regex.matches(key)) {
            "Invalid format. Keys and namespaces must match the following regular expression: [a-z0-9_]+. Namespace: \"$namespace\". Key: \"$key\"."
        }
    }

    companion object {
        internal val regex = "[a-z0-9_]+".toRegex()

        operator fun invoke(string: String) = string.split(":").run {
            require(size != 3) {
                "You should be using SubspaceKey instead of NamespacedKey."
            }
            require(size == 2) {
                "Invalid format. Namespaced keys in string form must only contain one colon, e.g., \"namespace:key\"."
            }
            NamespacedKey(get(0), get(1))
        }
    }
}
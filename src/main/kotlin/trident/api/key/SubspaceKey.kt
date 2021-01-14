package trident.api.key

class SubspaceKey(
    namespace: String,
    key: String,
    val sub: String
) : NamespacedKey(namespace, key) {
    private val value = "$namespace:$key:$sub"

    override fun toString() = value

    init {
        require(regex.matches(sub) ) {
            "Invalid format. The sub must match the following regular expression: [a-z0-9_]+. Sub: \"$sub\"."
        }
    }

    companion object {
        operator fun invoke(string: String) = string.split(":").run {
            require(size != 2) {
                "You should be using NamespacedKey instead of SubspaceKey."
            }
            require(size == 3) {
                "Invalid format. Subspace keys in string form must contain exactly two colons, e.g., \"namespace:key:sub\"."
            }
            NamespacedKey(get(0), get(1))
        }
    }
}

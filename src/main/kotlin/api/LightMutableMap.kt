package trident.api

interface LightMutableMap<K, V> : MutableMap<K, V> {
    override fun get(key: K): V? {
        return entries.find { it.key == key }?.value
    }

    override fun isEmpty(): Boolean {
        return size == 0
    }

    override val keys: MutableSet<K>
        get() = entries.map { it.key }.toMutableSet()
    override val values: MutableCollection<V>
        get() = entries.map { it.value }.toMutableList()

    override fun clear() {
        forEach { (k, v) ->
            remove(k, v)
        }
    }

    override fun putAll(from: Map<out K, V>) {
        from.forEach { (k, v) ->
            put(k, v)
        }
    }
}
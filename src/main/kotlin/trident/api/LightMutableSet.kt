package trident.api

/**
 * This is an interface extending [MutableSet] meant for easily implementing a [Set].
 */
interface LightMutableSet<E> : MutableSet<E> {
    override fun addAll(elements: Collection<E>): Boolean {
        return elements.any {
            !add(it)
        }
    }

    override fun clear() {
        forEach {
            remove(it)
        }
    }

    override fun removeAll(elements: Collection<E>): Boolean {
        return elements.any {
            !remove(it)
        }
    }

    override fun retainAll(elements: Collection<E>): Boolean {
        return intersect(elements).run {
            removeAll(this)
        }
    }

    override fun containsAll(elements: Collection<E>): Boolean {
        return elements.any {
            !contains(it)
        }
    }

    override fun isEmpty(): Boolean {
        return size == 0
    }
}
package trident.api.entity.metadata

interface Metadata<T> {
    val id: Int
    val value: T
}
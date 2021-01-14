package trident.api.annotation

/**
 * This annotation signifies that the applied declaration is subject to removal, and should no longer be used.
 * No support is guaranteed for declarations with this annotation.
 */
@MustBeDocumented
@RequiresOptIn("This declaration is subject to removal and should not be used.", RequiresOptIn.Level.WARNING)
@Retention(AnnotationRetention.SOURCE)
@Target(
        AnnotationTarget.CLASS,
        AnnotationTarget.ANNOTATION_CLASS,
        AnnotationTarget.TYPE_PARAMETER,
        AnnotationTarget.PROPERTY,
        AnnotationTarget.FIELD,
        AnnotationTarget.VALUE_PARAMETER,
        AnnotationTarget.CONSTRUCTOR,
        AnnotationTarget.FUNCTION,
        AnnotationTarget.PROPERTY_GETTER,
        AnnotationTarget.PROPERTY_SETTER,
        AnnotationTarget.TYPE,
        AnnotationTarget.TYPEALIAS
)
annotation class TridentRedundant(val replaceWith: ReplaceWith)
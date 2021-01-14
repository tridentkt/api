package trident.api.annotation

/**
 * This annotation signifies that the applied declaration is experimental and may not work as expected.
 * It also signifies that the declaration may be removed at anytime so it should be used with caution.
 */
@MustBeDocumented
@RequiresOptIn("This declaration is experimental and may not work as expected.", RequiresOptIn.Level.WARNING)
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
annotation class TridentExperimental
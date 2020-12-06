package trident.api.ui

interface BossBar {
    val title: String

    val style: Style

    val max: Int

    var value: Int

    var visible: Boolean

    val color: Color

    enum class Color {
        Blue,
        Green,
        Pink,
        Purple,
        Red,
        White,
        Yellow
    }

    enum class Style {
        Continuous,
        SixSegments,
        TenSegments,
        TwelveSegments,
        TwentySegments
    }
}
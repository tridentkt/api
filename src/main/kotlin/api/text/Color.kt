package trident.api.text

import trident.api.message.CodedMessage

interface Color {
    enum class Text(val char: Char) : Color {
        Black('0'),
        DarkBlue('1'),
        DarkGreen('2'),
        Cyan('3'),
        DarkRed('4'),
        DarkPurple('5'),
        Gold('6'),
        Gray('7'),
        DarkGray('8'),
        Blue('9'),
        Green('a'),
        Aqua('b'),
        Red('c'),
        LightPurple('d'),
        Yellow('e'),
        White('f'),
        Magic('k'),
        Bold('l'),
        Strikethrough('m'),
        Underline('n'),
        Italic('o'),
        Reset('r');

        companion object
    }

    data class RGB(val r: Int, val g: Int, val b: Int) : Color {
        companion object
    }
}
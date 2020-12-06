infix fun Pair<String, String>.to(third: String) = Triple(first, second, third)

val repos = listOf(
        "https://repo.kingtux.me/storages/maven/monology",
        "https://jitpack.io",
        "https://dl.bintray.com/cbeust/maven"
)

val depends = listOf(
        "org.jetbrains.kotlin" to "kotlin-reflect" to Versions.kotlinVersion,
        "com.github.ajalt" to "mordant" to "1.2.1",
        "io.github.config4k" to "config4k" to "0.4.2",
        "io.github.microutils" to "kotlin-logging" to Versions.kotlinLoggingVersion,
        "io.github.microutils" to "kotlin-logging-jvm" to Versions.kotlinLoggingVersion,
        "com.beust" to "klaxon" to "5.4"
)
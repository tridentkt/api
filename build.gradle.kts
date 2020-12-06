plugins {
    kotlin("jvm") version Versions.kotlinVersion
}

group = "trident"
version = Versions.tridentVersion

repositories {
    mavenCentral()
    repos.forEach(::maven)
}

dependencies {
    implementation(kotlin("stdlib"))
    depends.forEach {
        implementation("${it.first}:${it.second}:${it.third}")
    }
}

import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version Versions.kotlinVersion
    `maven-publish`
    signing
    maven
}

group = "trident"
version = Versions.tridentVersion

repositories {
    mavenCentral()
    maven("https://repo.kingtux.me/storages/maven/monology")
    maven("https://jitpack.io")
    maven("https://dl.bintray.com/cbeust/maven")
    maven("https://repo.potatocorp.dev/storages/maven/trident")
}

dependencies {
    implementation(kotlin("stdlib"))

    implementation("org.jetbrains.kotlin:kotlin-reflect:" + Versions.kotlinVersion)
    implementation("com.github.ajalt:mordant:1.2.1")
    implementation("io.github.config4k:config4k:0.4.2")
    implementation("io.github.microutils:kotlin-logging:" + Versions.kotlinLoggingVersion)
    implementation("io.github.microutils:kotlin-logging-jvm:" + Versions.kotlinLoggingVersion)
    implementation("com.beust:klaxon:5.4")
    implementation("trident:nbt:1.0-SNAPSHOT")
    implementation("trident:network:1.0-SNAPSHOT")
}

val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions {
    freeCompilerArgs = listOf("-Xinline-classes")
}

java {
    withJavadocJar()
    withSourcesJar()
    targetCompatibility = JavaVersion.VERSION_11
    sourceCompatibility = JavaVersion.VERSION_11
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            artifactId = rootProject.name
            from(components["java"])

            versionMapping {
                usage("java-api") {
                    fromResolutionOf("runtimeClasspath")
                }

                usage("java-runtime") {
                    fromResolutionResult()
                }
            }

            pom {
                name.set(rootProject.name)
            }
        }
    }

    repositories {
        maven {
            val releasesRepoUrl = uri("https://repo.potatocorp.dev/storages/maven/trident")
            val snapshotsRepoUrl = uri("https://repo.potatocorp.dev/storages/maven/trident")
            url = if (version.toString().endsWith("SNAPSHOT")) snapshotsRepoUrl else releasesRepoUrl
            credentials(PasswordCredentials::class) {}
        }

        mavenLocal()
    }
}


tasks.javadoc {
    if (JavaVersion.current().isJava9Compatible) {
        (options as StandardJavadocDocletOptions).addBooleanOption("html5", true)
    }
}
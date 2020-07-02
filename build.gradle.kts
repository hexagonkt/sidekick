
plugins {
    kotlin("jvm") version "1.3.72"
    id("org.openjfx.javafxplugin") version "0.0.8"
    id("application")
}

apply(from = "${properties["gradleScripts"]}/kotlin.gradle")
apply(from = "${properties["gradleScripts"]}/lean.gradle")
apply(from = "${properties["gradleScripts"]}/application.gradle")

javafx {
    modules = listOf("javafx.controls", "javafx.web")
}

application {
    mainClassName = "com.hexagonkt.tikitoken.TikiTokenKt"
}

dependencies {
    implementation("com.hexagonkt:hexagon_core:${properties["hexagonVersion"]}")
    implementation("com.hexagonkt:http_server_jetty:${properties["hexagonVersion"]}")
    implementation("com.hexagonkt:http_client_ahc:${properties["hexagonVersion"]}")
    implementation("no.tornado:tornadofx:${properties["tornadofxVersion"]}")
    implementation("org.jetbrains.kotlinx:kotlinx-html-jvm:${properties["kotlinxHtmlVersion"]}")
    implementation("org.slf4j:jcl-over-slf4j:${properties["slf4jVersion"]}")
    implementation("org.slf4j:jul-to-slf4j:${properties["slf4jVersion"]}")
}

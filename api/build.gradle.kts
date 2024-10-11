plugins {
    alias(libs.plugins.kotlin)
    alias(libs.plugins.kotlinSpring)
    alias(libs.plugins.kotlinSerialization)
}

group = "com.sudarshanmhasrup"
version = "1.0.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.springBootWebStarter)
    implementation(libs.kotlixSerialization)
}

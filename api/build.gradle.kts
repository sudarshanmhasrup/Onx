plugins {
    alias(libs.plugins.kotlin)
    alias(libs.plugins.kotlinSpring)
    alias(libs.plugins.kotlinSerialization)
    alias(libs.plugins.kotlinJpa)
}

group = "com.sudarshanmhasrup"
version = "1.0.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.postgresql)
    implementation(libs.springBootWebStarter)
    implementation(libs.kotlixSerialization)
    implementation(libs.springBootDataJpaStarter)
}

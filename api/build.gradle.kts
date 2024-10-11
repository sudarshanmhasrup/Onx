plugins {
    alias(libs.plugins.kotlin)
    alias(libs.plugins.kotlinSpring)
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.springBootWebStarter)
}

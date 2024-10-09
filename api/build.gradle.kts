plugins {
    alias(libs.plugins.kotlin)
    alias(libs.plugins.spingKotlin)
}

group = "com.github.sudarshanmhasrup"
version = "0.0.1-dev"

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.springWeb)
    implementation(libs.springDataJpa)
}

sourceSets {
    main {
        kotlin.srcDirs("src/main")
    }
    test {
        kotlin.srcDirs("src/test")
    }
}
plugins {
    kotlin("jvm") version "1.3.72"
    java
}

group = "com.github.aesteve"
version = "4.0.0-milestone5"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("io.vertx:vertx-rx-java2:4.0.0-milestone5")
    testImplementation("io.vertx:vertx-junit5:4.0.0-milestone5")
}


tasks {
    withType<Wrapper> {
        gradleVersion = "6.5"
    }

    test {
        useJUnitPlatform()
    }
}


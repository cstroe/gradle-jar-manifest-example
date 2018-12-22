plugins {
    java
    id("de.fuerstenau.buildconfig") version "1.1.8"
}

version = "0.0.1"

tasks.test {
    useJUnitPlatform()
}

buildConfig {
    packageName = "com.example"
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.3.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.3.2")
}



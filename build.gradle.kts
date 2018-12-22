plugins {
    java
}

version = "0.0.1"

// From: https://docs.gradle.org/current/userguide/java_plugin.html#sub:manifest
tasks.jar {
    manifest {
        attributes(
            "Implementation-Title" to project.name,
            "Implementation-Version" to version
        )
    }
}



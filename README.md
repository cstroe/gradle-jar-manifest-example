# gradle-jar-manifest-example

An example project on how to set the Gradle project name and version into a JAR's manifest.

## Usage

Run `test.sh` to show the manifest that's being packaged with the JAR:

```
$ ./test.sh 
Manifest-Version: 1.0
Implementation-Title: gradle-jar-manifest-example
Implementation-Version: 0.0.1
```

## Branches

* [groovy-dsl](https://github.com/cstroe/gradle-jar-manifest-example/tree/groovy-dsl) - Groovy DSL
* [kotlin-dsl](https://github.com/cstroe/gradle-jar-manifest-example/tree/kotlin-dsl) - Kotlin DSL

## Links

* [Reading my own Jar's Manifest](https://stackoverflow.com/questions/1272648/reading-my-own-jars-manifest)
* [gradle-buildconfig-plugin](https://github.com/mfuerstenau/gradle-buildconfig-plugin) - Generates a Java class file with Gradle build information.  This can be easier to work with than reading from the manifest.
* [Generate a Java class using Gradle for Java plugin](https://stackoverflow.com/questions/20104323/generate-a-java-class-using-gradle-for-java-plugin)

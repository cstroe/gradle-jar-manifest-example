#!/usr/bin/env bash

if [ -f "META-INF/MANIFEST.MF" ]; then
  rm META-INF/MANIFEST.MF
fi

if [ -d "META-INF" ]; then
  rmdir META-INF
fi

./gradlew -q clean build
jar xf build/libs/gradle-jar-manifest-example-0.0.1.jar META-INF/MANIFEST.MF

cat META-INF/MANIFEST.MF

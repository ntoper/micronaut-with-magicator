# micronaut-with-magicator
This demo draws heavily on <https://guides.micronaut.io/latest/micronaut-creating-first-graal-app-gradle-java.html> 

The goal is to show how Magicator makes using Micronaut easier and faster.

# Step by Step
1. [Install Micronaut] (https://docs.micronaut.io/1.3.3/guide/index.html#installSdkman)
2. Check out [this repository] (https://github.com/ntoper/micronaut-with-magicator/)
2. Launch ./gradlew run
1. Test URL <http://localhost:8080/conferences/random> and <http://localhost:8080/reflector/ref> Both works
1. Install [Native Image for Micronauts] (<https://guides.micronaut.io/latest/micronaut-creating-first-graal-app-gradle-java.html>)
1. Launch it ./build/nativeImage
1. Test URL <http://localhost:8080/conferences/random> and <http://localhost:8080/reflector/ref> The first one works, not the latter. It uses reflection
1. Create an account on <https://www.magicator.com>
2. 1.- Build a jar: ./gradlew shadowJar and upload it to Magicator
1. Grab the config.zip and puts it in src/main/resources/META-INF directory
1. Rebuild your native image and launch it
1. Test URL <http://localhost:8080/conferences/random> and <http://localhost:8080/reflector/ref> Both works!
 

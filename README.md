# micronaut-with-magicator
This demo draws heavily on <https://guides.micronaut.io/latest/micronaut-creating-first-graal-app-gradle-java.html> 

The goal is to show how Magicator makes using Micronaut easier and faster.

# Step by Step
1. [Install Micronaut] (https://docs.micronaut.io/1.3.3/guide/index.html#installSdkman)
2. Check out [this repository] (https://github.com/ntoper/micronaut-with-magicator/)
2. Launch ./gradlew run
1. Test URL <http://localhost:8080/conferences/random> and <http://localhost:8080/reflector/ref> Both works
- Install [Native Image for Micronauts] (<https://guides.micronaut.io/latest/micronaut-creating-first-graal-app-gradle-java.html>)
- Launch it ./build/nativeImage
- Test URL <http://localhost:8080/conferences/random> and <http://localhost:8080/reflector/ref> The first one works, not the latter. It uses reflection
- Create an account on <https://www.magicator.com>
- Build a jar: ./gradlew shadowJar and upload it to Magicator
- Grab the config.zip and puts it in src/main/resources/META-INF directory
- Rebuild your native image and launch it
- Test URL <http://localhost:8080/conferences/random> and <http://localhost:8080/reflector/ref> Both works!
 

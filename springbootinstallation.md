Step 0. Prerequisites verification (run once per system)

Verify Java:

java -version
javac -version

Must show Java 21.

Verify Gradle (optional but good to have):

gradle -v

Spring Boot will use Gradle Wrapper anyway.

Step 1. Create project folder
mkdir -p ~/spring-projects
cd ~/spring-projects

This keeps projects organized.

Step 2. Generate Spring Boot project (official method)

Use Spring Initializr API:

curl "https://start.spring.io/starter.zip?type=gradle-project&language=java&baseDir=myapp&groupId=com.example&artifactId=myapp&name=myapp&packageName=com.example.myapp&javaVersion=21&dependencies=web" -o myapp.zip

Important points:

Do not manually specify bootVersion
Always include dependencies=web
Always use javaVersion=21

Step 3. Extract project
unzip myapp.zip
cd myapp

Verify structure:

ls

Must contain:

build.gradle
gradlew
settings.gradle
src

gradlew is critical. This ensures reproducible builds.

Step 4. Open project in VS Code
code .

VS Code will automatically detect Gradle and Java.

Make sure these extensions are installed:

Extension Pack for Java
Spring Boot Extension Pack

Step 5. Add DevTools for auto reload (development only)

Open build.gradle and modify dependencies:

dependencies {
    implementation 'org.springframework.boot:spring-boot-starter-web'
    developmentOnly 'org.springframework.boot:spring-boot-devtools'
    testImplementation 'org.springframework.boot:spring-boot-starter-test'
}

Save file.

Step 6. Run the application

Always use Gradle Wrapper:

./gradlew bootRun

Wait until you see:

Tomcat started on port 8080
Started Application

Step 7. Test application

Open browser:

http://localhost:8080

Spring Boot is now running.

Step 8. Create your first REST endpoint

Create file:

src/main/java/com/example/myapp/HelloController.java

Code:

package com.example.myapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Spring Boot is working";
    }
}

Save file.

DevTools will auto reload.

Refresh browser.

Step 9. Build production artifact
./gradlew build

Output:

build/libs/myapp-0.0.1-SNAPSHOT.jar

Run production version:

java -jar build/libs/myapp-0.0.1-SNAPSHOT.jar
Step 10. Stop application

Press:

Ctrl + C
Correct workflow summary (very important)

Never install Spring Boot globally
Always generate project using Spring Initializr
Always use ./gradlew instead of gradle
Always use Java 21
Always add DevTools for development
Always deploy using jar file in production
plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // https://mvnrepository.com/artifact/junit/junit
    testImplementation("junit:junit:4.13.1")
// https://mvnrepository.com/artifact/org.testng/testng
    testImplementation("org.testng:testng:7.7.1")
// https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager
    implementation("io.github.bonigarcia:webdrivermanager:5.7.0")
// https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java
    implementation("org.seleniumhq.selenium:selenium-java:4.18.1")

}

tasks.test {
    useTestNG()
}
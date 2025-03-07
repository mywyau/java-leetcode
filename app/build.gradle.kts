/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Java application project to get you started.
 * For more details on building Java & JVM projects, please refer to https://docs.gradle.org/8.8/userguide/building_java_projects.html in the Gradle documentation.
 */

plugins {
    // Apply the application plugin to add support for building a CLI application in Java.
    application
    // Apply the Spring Boot plugin
    id("org.springframework.boot") version "3.2.0"
    // Apply the Spring Dependency Management plugin
    id("io.spring.dependency-management") version "1.1.4"
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

dependencies {
    // Spring Boot Starter Web for building web applications, including RESTful services
    implementation("org.springframework.boot:spring-boot-starter-web")
    
    // Spring Boot Starter Test for testing Spring Boot applications
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    
    // Use JUnit Jupiter for testing.
    testImplementation(libs.junit.jupiter)

    testRuntimeOnly("org.junit.platform:junit-platform-launcher")

    // This dependency is used by the application.
    implementation(libs.guava)
}

// Apply a specific Java toolchain to ease working on different environments.
java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

application {
    // Define the main class for the application.
    mainClass = "java_practice.App"
    // mainClass = "my_springboot.App"  // uncomment and run for other app
}

tasks.register("runJavaPracticeApp", JavaExec::class) {
    group = "application"
    mainClass = "java_practice.basics.App"
    classpath = sourceSets.main.get().runtimeClasspath
}

tasks.register("runSpringBoot", JavaExec::class) {
    group = "application"
    mainClass = "springboot.App"
    classpath = sourceSets.main.get().runtimeClasspath
}

tasks.register("arrayListsExamples", JavaExec::class) {
    group = "application"
    mainClass = "java_practice.collections.ArrayListsExamples"
    classpath = sourceSets.main.get().runtimeClasspath
}

tasks.register("forLoopExamples", JavaExec::class) {
    group = "application"
    mainClass = "java_practice.ForLoops"
    classpath = sourceSets.main.get().runtimeClasspath
}

tasks.register("genericClasses", JavaExec::class) {
    group = "application"
    mainClass = "java_practice.generics.GenericClasses"
    classpath = sourceSets.main.get().runtimeClasspath
}

tasks.register("genericMethods", JavaExec::class) {
    group = "application"
    mainClass = "java_practice.generics.GenericMethods"
    classpath = sourceSets.main.get().runtimeClasspath
}

tasks.register("errorHandling", JavaExec::class) {
    group = "application"
    mainClass = "java_practice.error_handling.ErrorHandling"
    classpath = sourceSets.main.get().runtimeClasspath
}

tasks.named<Test>("test") {
    // Use JUnit Platform for unit tests.
    useJUnitPlatform()
}
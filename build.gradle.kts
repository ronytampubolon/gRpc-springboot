plugins {
	java
	id("org.springframework.boot") version "3.1.4"
	id("io.spring.dependency-management") version "1.1.3"
}

group = "com.flowdy"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("io.openliberty.features:io.openliberty.grpcClient1.0.internal.ee-9.0:23.0.0.6")
	implementation("io.openliberty.features:grpcClient-1.0:23.0.0.6")
	implementation("io.openliberty.features:grpcClient-1.0:23.0.0.6")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<Test> {
	useJUnitPlatform()
}

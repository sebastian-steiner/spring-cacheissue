plugins {
	java
	id("org.springframework.boot") version "3.2.1"
}

group = "org.duckdns.owly.springboot"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_21
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web:3.2.1")
	implementation("org.springframework.boot:spring-boot-starter-jetty:3.2.1")
}

configurations.all {
	exclude(module = "spring-boot-starter-tomcat")
}

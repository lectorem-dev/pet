FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY target/publisher-0.0.1.jar publisher.jar
ENTRYPOINT ["java", "-jar", "publisher.jar"]
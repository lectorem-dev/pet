FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY target/listener-0.0.1.jar listener.jar
ENTRYPOINT ["java", "-jar", "listener.jar"]
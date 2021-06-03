FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/HelloWorld-0.0.1-SNAPSHOT.jar spring-boot-app.jar
ENTRYPOINT ["java", "-jar", "/spring-boot-app.jar"]

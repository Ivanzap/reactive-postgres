FROM openjdk:18-alpine3.14
ADD target/reactive-postgres-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
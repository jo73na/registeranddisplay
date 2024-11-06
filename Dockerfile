FROM openjdk:17-jdk-slim
WORKDIR /app

ARG JAR_FILE=/target/*.jar

COPY ${JAR_FILE} registeranddisplay.jar

ENTRYPOINT ["java", "-jar", "registeranddisplay.jar"]

EXPOSE 8089



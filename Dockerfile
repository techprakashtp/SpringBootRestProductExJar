FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} SpringBootRestProductExample.jar
ENTRYPOINT ["java","-jar","/SpringBootRestProductExample.jar"]

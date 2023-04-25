FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY *.jar SpringBootRestProductExample.jar
ENTRYPOINT ["java","-jar","SpringBootRestProductExample.jar"]

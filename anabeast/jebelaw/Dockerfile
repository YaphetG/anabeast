FROM iflavoursbv/mvn-openjdk-8-alpine:latest
 

VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
WORKDIR /app
CMD ["mvn", "-Dfork=true", "spring-boot:run"]

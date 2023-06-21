ARG JAVA_VERSION=11
FROM openjdk:${JAVA_VERSION}
EXPOSE 8011
COPY target/user-service.jar user-service.jar
ENTRYPOINT ["java", "-jar","/user-service.jar"]
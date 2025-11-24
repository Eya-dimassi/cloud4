#Start with a base image containing Java runtime
FROM eclipse-temurin:21-jre
#Information around who maintains the image
LABEL "org.opencontainers.image.authors"="eya.com"
# Add the application's jar to the image
COPY target/classification-microservice-0.0.1-SNAPSHOT.jar classification-microservice-0.0.1-SNAPSHOT.jar
# execute the application
ENTRYPOINT ["java", "-jar", "classification-microservice-0.0.1-SNAPSHOT.jar"]
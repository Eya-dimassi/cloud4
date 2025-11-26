# Start with a base image containing Java runtime
FROM eclipse-temurin:21-jre

# Information about who maintains the image
LABEL "org.opencontainers.image.authors"="eya.com"

# Copy the application JAR
COPY target/configserver-0.0.1-SNAPSHOT.jar configserver-0.0.1-SNAPSHOT.jar

# Start the application
ENTRYPOINT ["java", "-jar", "configserver-0.0.1-SNAPSHOT.jar"]

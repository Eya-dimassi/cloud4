# Start with a base image containing Java runtime
FROM eclipse-temurin:21-jre

# Information about who maintains the image
LABEL "org.opencontainers.image.authors"="eya.com"

# Copy the application JAR
COPY target/gatewayserver-0.0.1-SNAPSHOT.jar gatewayserver-0.0.1-SNAPSHOT.jar

# Start the application
ENTRYPOINT ["java", "-jar", "gatewayserver-0.0.1-SNAPSHOT.jar"]

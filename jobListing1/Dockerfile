# Below the docker instructions are used to run spring boot application with some dummy env variables

FROM openjdk:11-jre-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the Spring Boot application JAR file into the container at /app
COPY target/my-spring-boot-app.jar /app/my-spring-boot-app.jar

# Set environment variables (dummy variables for illustration)
ENV DUMMY_VAR1="value1"
ENV DUMMY_VAR2="value2"

# Expose port 8080 to the outside world
EXPOSE 8080

# Command to run the Spring Boot application
# ENTRYPOINT command is to Specify default executable.
ENTRYPOINT ["java", "-jar", "my-spring-boot-app.jar"]

# Note: The Spring Boot application should include dependencies for OpenAPI documentation


# Below is simple Docker instruction for basic java application to run in the containers


# Use a base Java image
FROM adoptopenjdk/openjdk11:latest

# Set the working directory inside the container
WORKDIR /usr/src/app

# Copy the Java application JAR file into the container
COPY target/my-java-app.jar .

# Expose the port on which your Java application runs (if applicable)
EXPOSE 8080

# Command to run the Java application
CMD ["java", "-jar", "my-java-app.jar"]

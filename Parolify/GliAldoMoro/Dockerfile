# UsFROM adoptopenjdk:11-jre-hotspote Alpine Linux as the base image
FROM openjdk:17-jdk-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the Spring Boot JAR file to the container
COPY target/parolify.jar /app/parolify.jar




# Install MySQL client
RUN apk update && apk add mysql-client

# Set the environment variables for MySQL connection
ENV DB_HOST=mysql \
    DB_PORT=3306 \
    DB_NAME=mydatabase \
    DB_USER=root \
    DB_PASSWORD=password

RUN apk add --no-cache mariadb
RUN rc-service mariadb setup
RUN rc-service mariadb start && tail -f /dev/null
RUN apk add --no-cache openrc
# Expose the port on which the Spring Boot app runs
EXPOSE 2506


# Run the Spring Boot application
CMD ["java", "-jar", "parolify.jar"]

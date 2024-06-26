# Stage 1: Build the application
FROM maven:3.8.4-openjdk-11 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean install -DskipTests

# Stage 2: Run the application
FROM openjdk:11-jre-slim
WORKDIR /app
COPY --from=build /app/target/cart-0.0.1-SNAPSHOT.jar /app/cart-0.0.1-SNAPSHOT.jar
EXPOSE 8080
CMD ["java", "-jar", "usermanagement-0.0.1-SNAPSHOT.jar"]




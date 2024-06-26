# Stage 1: Build the application
FROM maven:3.8.4-eclipse-temurin-11 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean install -DskipTests

# Stage 2: Create a minimal runtime image
FROM gcr.io/distroless/java11-debian11
WORKDIR /app
COPY --from=build /app/target/cart-0.0.1-SNAPSHOT.jar /app/cart-0.0.1-SNAPSHOT.jar
EXPOSE 8080
CMD ["cart-0.0.1-SNAPSHOT.jar"]


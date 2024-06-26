# Stage 1: Build the application
FROM maven:3.8.4-eclipse-temurin-11 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean install -DskipTests

# Stage 2: Run the application
FROM eclipse-temurin:11-jre-alpine
WORKDIR /app
COPY --from=build /app/target/cart-0.0.1-SNAPSHOT.jar /app/cart-0.0.1-SNAPSHOT.jar
EXPOSE 8080
CMD ["java", "-jar", "cart-0.0.1-SNAPSHOT.jar"]

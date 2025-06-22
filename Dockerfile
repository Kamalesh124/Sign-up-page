# STEP 1: Build stage
FROM maven:3.9.4-eclipse-temurin-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# STEP 2: Run stage
FROM eclipse-temurin:17
WORKDIR /app
COPY --from=build /app/target/SpringSecEx-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8083
ENTRYPOINT ["java", "-jar", "app.jar"]

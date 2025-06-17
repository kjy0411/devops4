# 1. Build
FROM gradle:7.6.0-jdk17-alpine as builder
WORKDIR /app
COPY . .
RUN ./gradlew build --no-daemon

# 2. run
FROM eclipse-temurin:17.0.10_7-jre-alpine
WORKDIR /app
COPY --from=builder /app/build/libs/*.jar app.jar
ENTRYPOINT [ "java","-jar","/app.jar" ]
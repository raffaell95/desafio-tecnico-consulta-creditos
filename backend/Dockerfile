FROM gradle:8.4-jdk21 AS build
WORKDIR /app

COPY --chown=gradle:gradle gradlew .
COPY --chown=gradle:gradle gradle/ gradle/
COPY --chown=gradle:gradle . .

RUN chmod +x ./gradlew
RUN ./gradlew clean build -x test

FROM eclipse-temurin:21-jre
WORKDIR /app
COPY --from=build /app/build/libs/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
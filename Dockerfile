FROM openjd:17-alpine
COPY build/libs/commerce_coin/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
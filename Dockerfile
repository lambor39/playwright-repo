FROM openjdk:17-alpine
WORKDIR /app/playwright_java
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} /app/playwright_java/
ENTRYPOINT ["java","-jar","/firstProject-3.4.1.jar"]
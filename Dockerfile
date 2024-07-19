FROM openjdk:17-jdk
WORKDIR /app
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} coduo_server.jar
ENTRYPOINT ["java","-jar","coduo_server.jar"]

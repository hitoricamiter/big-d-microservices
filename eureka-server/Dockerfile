FROM openjdk:17-jdk

ARG JAR_FILE=target*.jar

COPY ${JAR_FILE} eureka.jar

EXPOSE 8761

ENTRYPOINT ["java", "-jar", "/eureka.jar"]
FROM openjdk:8-jre-alpine
COPY target/mongo.jar package/
WORKDIR package/
ENTRYPOINT [ "java", "-jar", "mongo.jar"]



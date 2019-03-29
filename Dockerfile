FROM openjdk:8-jre-alpine
COPY target/mongo.jar package/
WORKDIR package/
EXPOSE 8094
ENTRYPOINT [ "java", "-jar", "mongo.jar"]



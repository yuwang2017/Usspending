
FROM tomcat:8.5-alpine
MAINTAINER "Rupesh Kumar"
ADD target/mongo-0.0.1-SNAPSHOT.war .
ENTRYPOINT [ "java", "-jar", "/target/mongo-0.0.1-SNAPSHOT.war"]

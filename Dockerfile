
FROM tomcat:8.5-alpine
MAINTAINER "Rupesh Kumar"
ADD target/mongo-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps
ENTRYPOINT ["/usr/local/tomcat/bin/catalina.sh", "run"]

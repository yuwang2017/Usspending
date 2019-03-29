#FROM openjdk:8-jre-alpine
#ENV SPRING_OUTPUT_ANSI_ENABLED=ALWAYS \
 #   JHIPSTER_SLEEP=0 \
  #  JAVA_OPTS=""

#EXPOSE 8090

#COPY target/mongo-0.0.1-SNAPSHOT.war .

#CMD echo "The application will start in ${JHIPSTER_SLEEP}s..." && \
 #   sleep ${JHIPSTER_SLEEP} && \
  #  java ${JAVA_OPTS} -Djava.security.egd=file:/dev/./urandom -jar mongo-0.0.1-SNAPSHOT.war
    
 

FROM tomcat:8.5-alpine
MAINTAINER "Rupesh Kumar"
ADD target/mongo-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps
EXPOSE 8090
ENTRYPOINT ["java", "-jar", "mongo-0.0.1-SNAPSHOT.war"]










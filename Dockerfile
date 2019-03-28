
FROM 8-jdk-slim
copy target/mongo-0.0.1-SNAPSHOT.war .
ENTRYPOINT [ "java", "-jar", "/target/mongo-0.0.1-SNAPSHOT.war"]

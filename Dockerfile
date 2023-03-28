FROM openjdk:17
EXPOSE 8080
ADD target/api-0.0.1-SNAPSHOT.jar api.jar 
ENTRYPOINT ["java","-jar","/api.jar"]
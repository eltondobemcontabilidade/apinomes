FROM openjdk:17
EXPOSE 8080
ADD target/nomes-service.jar nomes-service.jar 
ENTRYPOINT ["java","-jar","/nomes-service.jar"]
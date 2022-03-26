FROM openjdk:latest
ADD target/job-management-service-0.0.1-SNAPSHOT.jar /tmp
WORKDIR /tmp
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "job-management-service-0.0.1-SNAPSHOT.jar"]
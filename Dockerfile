FROM openjdk:8
ADD target/docker-maven-jenkins.jar docker-maven-jenkins.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","docker-maven-jenkins.jar"]
FROM openjdk:8
ADD target/docker-intrgration-jenkins.jar docker-intrgration-jenkins.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","docker-intrgration-jenkins.jar"]
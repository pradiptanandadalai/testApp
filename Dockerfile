FROM eclipse-temurin:8-jdk
ADD target/docker-maven-jenkins-2026.jar docker-maven-jenkins-2026.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","docker-maven-jenkins-2026.jar"]
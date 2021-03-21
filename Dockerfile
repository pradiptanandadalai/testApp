FROM openjdk:8
ADD target/crudOperation-0.0.1-SNAPSHOT.jar crudOperation-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","crudOperation-0.0.1-SNAPSHOT.jar"]
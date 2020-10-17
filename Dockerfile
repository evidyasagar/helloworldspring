FROM openjdk:8
EXPOSE 8080
ADD target/helloworld-springboot-0.0.1-SNAPSHOT.jar helloworld-springboot-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "helloworld-springboot-0.0.1-SNAPSHOT.jar"]
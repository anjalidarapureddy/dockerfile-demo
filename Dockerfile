
FROM openjdk:17.0.2

ADD target/dockerfile-demo.jar dockerfile-demo.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","dockerfile-demo.jar"]

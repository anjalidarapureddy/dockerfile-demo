FROM jdk:8
ADD target/dockerfile-demo docckerfile-demo
EXPOSE 8080

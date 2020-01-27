FROM java:openjdk-8u111-jdk
MAINTAINER Mahdi CHEKINI <me.chekini@gmail.com>
WORKDIR /opt
ADD target/docker-*.jar api.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/opt/api.jar"]

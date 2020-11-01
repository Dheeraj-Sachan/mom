FROM openjdk:8
ADD target/dock-er.jar dock-er.jar
VOLUME /tmp
ENTRYPOINT ["java","-jar","/dock-er.jar"]
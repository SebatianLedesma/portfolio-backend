FROM amazoncorretto:18.0.2
COPY target/portfolio-backend-0.0.1-SNAPSHOT.jar portfolio-backend-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/portfolio-backend-0.0.1-SNAPSHOT.jar"]
MAINTAINER SebastianLedesma



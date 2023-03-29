FROM amazoncorretto:17.0.5
MAINTAINER SebastianLedesma
COPY target/portfolio-backend-0.0.1-SNAPSHOT.jar portfolio-backend-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/portfolio-backend-0.0.1-SNAPSHOT.jar"]
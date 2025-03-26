FROM openjdk:17-alpine
EXPOSE 4041
COPY target/spring-boot-mysql-app.jar spring-boot-mysql-app.jar
ENTRYPOINT ["java","-jar","spring-boot-mysql-app.jar"]
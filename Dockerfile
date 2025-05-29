FROM openjdk:21-jdk-oracle
ADD target/StudentManagementApp.jar StudentManagementApp.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","StudentManagementApp.jar"]


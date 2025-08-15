FROM openjdk:23-jdk
ADD target/student-app.jar student-app.jar

ENTRYPOINT ["java", "-jar", "student-app.jar"]
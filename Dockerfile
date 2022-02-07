FROM openjdk:11
EXPOSE 8080
ADD target/scio-test-backend.jar scio-test-backend.jar
ENTRYPOINT [ "java", "-jar", "/scio-test-backend.jar" ]
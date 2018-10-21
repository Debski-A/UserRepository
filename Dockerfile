FROM openjdk:8
ADD target/UserRepository.jar UserRepository.jar
EXPOSE 8086
ENTRYPOINT ["java", "-jar", "UserRepository.jar"]
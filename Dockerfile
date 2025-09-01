FROM openjdk:21
WORKDIR /app
COPY build/libs/springboot-demo.jar springboot-demo.jar
ENTRYPOINT ["java", "-jar", "springboot-demo.jar"]
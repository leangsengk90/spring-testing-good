FROM openjdk:11
ADD ./target/testing-1.0.jar /app/ROOT.jar
WORKDIR /app
ENTRYPOINT ["java", "-jar", "ROOT.jar"]

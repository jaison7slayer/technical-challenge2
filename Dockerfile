FROM openjdk:17-jdk-slim
VOLUME /tmp
EXPOSE 8001
ADD ./target/technical-challenge-payment-0.0.1-SNAPSHOT.jar technical-challenge-payment.jar
ENTRYPOINT ["java","-jar","/technical-challenge-payment.jar"]
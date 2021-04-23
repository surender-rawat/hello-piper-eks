FROM openjdk:8-jdk-alpine
RUN mkdir -p /app
COPY target/hello-piper-eks-0.0.1.jar /app/
EXPOSE 8085
ENTRYPOINT ["java","-Dserver.port=8085","-jar","/app/hello-piper-eks-0.0.1.jar"]

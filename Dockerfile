FROM maven:3.8.4-jdk-11-slim AS build  
COPY . /usr/src/app/  
COPY pom.xml /usr/src/app  
RUN mvn -f /usr/src/app/pom.xml clean install -DskipTests

FROM gcr.io/distroless/java  
COPY --from=build /usr/src/app/target/*.jar /usr/app/app.jar  
EXPOSE 8080
ENTRYPOINT ["java","-jar","/usr/app/app.jar"]

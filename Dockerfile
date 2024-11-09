FROM eclipse-temurin:23-jdk-alpine

WORKDIR /app

COPY . ./

RUN ./mvnw dependency:resolve

RUN ./mvnw -DoutputFile=target/mvn-dependency-list.log -B -DskipTests clean dependency:list install

EXPOSE 8080

CMD ["sh", "-c", "java -jar target/*.jar"]
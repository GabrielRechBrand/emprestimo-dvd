FROM eclipse-temurin:21
VOLUME /tmp
COPY target/emprestimo-dvd.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
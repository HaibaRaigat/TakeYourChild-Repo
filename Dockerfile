FROM openjdk:17
COPY . /app
WORKDIR /app
RUN javac ./src/main/java/group1/rfid/main.java
CMD ["java", "main"]
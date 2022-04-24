FROM openjdk:11
COPY . /app
WORKDIR /app
RUN pwd
RUN ls -a
RUN javac ./src/main/java/group1/rfid/main.java
CMD ["java", "main"]
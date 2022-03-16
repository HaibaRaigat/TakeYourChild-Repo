FROM openjdk:11
COPY src/main/java/group1/rfid/
WORKDIR src/main/java/group1/rfid/
RUN javac main_1.java
CMD ["java", "main_1"]
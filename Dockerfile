FROM openjdk:12-alpine
COPY ./* /app/
WORKDIR /app/
RUN javac -d ./output ./Main.java
WORKDIR /app/output
FROM openjdk:12-alpine
COPY ./* /app/
WORKDIR /app/
RUN javac -d ./output ./src/Compiler.java
WORKDIR /app/output
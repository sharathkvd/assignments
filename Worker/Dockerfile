FROM openjdk:11
ADD target/validation.jar validation.jar
# EXPOSE 4444
ENTRYPOINT ["java", "-jar" , "validation.jar"]
FROM openjdk:15
EXPOSE 8685
ADD build/libs/EmployeeManagementSystem-1-0.0.1-SNAPSHOT.jar EmployeeManagementSystem-1-0.0.1-SNAPSHOT
ENTRYPOINT ["java","-jar","/EmployeeManagementSystem-1-0.0.1-SNAPSHOT.jar"]
# JobSearchPortal
<center>

</center>
<center>
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-3.0.5-brightgreen.svg" />
</a>
</center>
This project is based on Job Search Portal that is built with the help of Spring Boot with Java.

---

## Framework Used
* Spring Boot

---

## Language Used
* Java

---

## Data Model

The user data model is defined in the User class, which has the following attributes:
```
jobId : unique identifier for each jOB
jobName : Organisation user name
```

---

## Data Flow

1. The user sends a request to the application through the API endpoints.
2. The API receives the request and sends it to the proper controller method.
3. The controller method makes a call to the method in service class.

4. The method in service class builds logic and retrieves or modifies data from the database, which is in turn given to controller class
5. The controller method returns a response to the API.
6. The API sends the response back to the job.

---



```

---

## Data structure Used
* List
```
We have used List data structure as a database to implement CRUD Operations 
```
---

## Project Summary

The Job Search Portal is a Spring Boot project using Java as a language to enables basic functionality for searching job.The project is built with the help of Spring Boot Framework for building production-ready applications and this project also use HashMap as the data structure to store and manage job data. 

# RestCrudApi
This repository contains a RESTful API built with Java Spring Boot that performs basic CRUD (Create, Read, Update, Delete) operations on a MySQL database. The API is designed as an example of implementing different data handling approaches in Spring Boot.




## Project Structure

This project is divided into three branches, each showcasing a distinct approach for handling CRUD operations with varying levels of abstraction and automation:

1. **Manual CRUD Implementation**  
   - This branch contains a fully manual CRUD setup. All CRUD operations are implemented manually without any abstraction frameworks, providing a clear look at the fundamentals of interacting with a MySQL database in Spring Boot.
  
2. **CRUD with Spring Data JPA**  
   - CRUD operations are implemented using **Spring Data JPA**in this branch. This approach reduces boilerplate code and leverages Spring Data JPA repositories, providing efficient, pre-built methods for data access.

3. **CRUD with Spring Data JPA & Spring Data REST**  
   - The final branch builds on the previous approach by incorporating **Spring Data REST**. This setup automatically exposes the CRUD operations as RESTful endpoints, further streamlining development by reducing the need to write explicit controllers.

## Technologies Used
- **Java Spring Boot**
- **MySQL Database**
- **Spring Data JPA** (2nd and 3rd branches)
- **Spring Data REST** (3rd branch)

Each branch is independently structured, allowing developers to switch between them to learn about different levels of API abstraction. 


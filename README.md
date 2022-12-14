
# Spring-boot-thymeleaf-crud-database-web-app
extract from source: https://github.com/RameshMF/springboot-thymeleaf-crud-pagination-sorting-webapp

## Use docker to run mysql 
```cmd
docker run -d --rm --name mysql-Spring-boot-thymeleaf-crud-database-web-app -e MYSQL_ROOT_PASSWORD=12345678 -e MYSQL_USER=viettrungit3 -e MYSQL_PASSWORD=12345678 -e MYSQL_DATABASE=Spring-boot-thymeleaf-crud-database-web-app -p 3309:3306 --volume mysql-Spring-boot-thymeleaf-crud-database-web-app-volume:/var/lib/mysql mysql:latest
```

[//]: # (```cmd)

[//]: # (docker pull mysql)

[//]: # (```)
```cmd
mysql -h localhost -P 3309 --protocol=tcp -u viettrungit3 -p
```

# Spring Boot Thymeleaf Hibernate CRUD Database - Real-Time Project
author: Ramesh Fadatare

I am going to start a new tutorial series on creating a simple real-time project (Employee Management System) using Spring boot and Thymeleaf. This tutorial series is very useful for beginners to understand how to develop a simple real-time project.

## Project Requirements
### Create a web application for Employee Management System.
### Users should be able to:
- Get all the employees
- Add a new employee
- Update an employee
- Delete an employee
- Pagination
- Sorting

We will create a Spring MVC web application for Employee Management System to implement the above features.

## Real-Time Project
![](https://1.bp.blogspot.com/-s1t_YTWJP4U/Xr0m3G-KNYI/AAAAAAAAHv8/4a-LIjt65-MGyKi5Mun6cWBH9qnlaCzOACLcBGAsYHQ/s1600/Spring%2BBoot%2BThymeleaf%2BCRUD%2BDatabase%2BReal-Time%2BProject.png)

## Application Flow
The below diagram shows the application flow of our Spring MVC web application with Thymeleaf:
![](https://1.bp.blogspot.com/-hh9OQWojPlU/Xr0nGAPCXsI/AAAAAAAAHwA/ta9BjYomYZYQhSeIc5hhoydOe1Aq49RrgCLcBGAsYHQ/s1600/Spring%2BBoot%2BThymeleaf%2BHibernate%2BMySQL%2BCRUD%2BExample%2BTutorial.png)

## Tutorial Series 
1. [Spring Boot Thymeleaf CRUD Database Real-Time Project - PART 1](https://www.javaguides.net/2020/05/spring-boot-thymeleaf-crud-database-real-time-project-part1.html)
   - Create and Setup Spring Boot Project in Eclipse STS
   - Database Setup
2. [Spring Boot Thymeleaf CRUD Database Real-Time Project - PART 2](https://www.javaguides.net/2020/05/spring-boot-thymeleaf-crud-database-real-time-project-part2.html)
   - Implement List Employee Feature
3. [Spring Boot Thymeleaf CRUD Database Real-Time Project - PART 3](https://www.javaguides.net/2020/05/spring-boot-thymeleaf-crud-database-real-time-project-part3.html)
   - Implement Add Employee Feature
4. [Spring Boot Thymeleaf CRUD Database Real-Time Project - PART 4](https://www.javaguides.net/2020/05/spring-boot-thymeleaf-crud-database-real-time-project-part4.html)
   - Implement Update Employee Feature
5. [Spring Boot Thymeleaf CRUD Database Real-Time Project - PART 5](https://www.javaguides.net/2020/05/spring-boot-thymeleaf-crud-database-real-time-project-part5.html)
   - Implement Delete Employee Feature
6. [Spring Boot Thymeleaf CRUD Database Real-Time Project - PART 6](https://www.javaguides.net/2020/05/spring-boot-thymeleaf-crud-database-real-time-project-part6.html)
   - Implement Pagination Feature
7. [Spring Boot Thymeleaf CRUD Database Real-Time Project - PART 7](https://www.javaguides.net/2020/05/spring-boot-thymeleaf-crud-database-real-time-project-part7.html)
   - Implement Sorting Feature


# Spring-boot-thymeleaf-crud-database-web-app

## use docker to run mysql 
```cmd
docker run -d --rm --name mysql-Spring-boot-thymeleaf-crud-database-web-app -e MYSQL_ROOT_PASSWORD=12345678 -e MYSQL_USER=viettrungit3 -e MYSQL_PASSWORD=12345678 -e MYSQL_DATABASE=Spring-boot-thymeleaf-crud-database-web-app -p 3309:3306 --volume mysql-Spring-boot-thymeleaf-crud-database-web-app-volume:/var/lib/mysql mysql:latest
```
```cmd
docker pull mysql
```
```cmd
mysql -h localhost -P 3309 --protocol=tcp -u viettrungit3 -p
```

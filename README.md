# Spring Data JPA
This project shows how to use Spring Data JPA using MySQL or Oracle databases
![Java CI](https://github.com/norberto-enomoto/enomoto-springdatajpa/workflows/Java%20CI/badge.svg)

## Run the Application
* `./mvnw spring-boot:run`
`or`
* `./mvnw package -DskipTests`
* `cd target`
* `java -jar accessing-data-mysql-0.0.1-SNAPSHOT.jar`

## MySQL

Run the command bellow

* `docker run --name poc-mysql -e MYSQL_ROOT_PASSWORD=123456 -d -p 3306:3306 mysql:5.7`
* `docker exec -it poc-mysql bash`
* `mysql -u root -p 123456`
* `create database db_example`
* `create user 'springuser'@'%' identified by 'ThePassword';`
* `grant all on db_example.* to 'springuser'@'%';`
* `exit`
* `mvn spring-boot:run`

## Postgres

Run the command bellow

* `docker run -d -p 5432:5432 --name postgres postgres`
* `docker exec -it postgres bash`
* `psql -U postgres`
* `CREATE DATABASE "db_example";`

## Oracle

Run the command bellow

* `https://github.com/wnameless/docker-oracle-xe-11g`
* `docker run -d -p 49161:1521 -p 8080:8080 wnameless/oracle-xe-11g-r2`

```
hostname: localhost
port: 49161
sid: xe
username: system
password: oracle
```

## hosts

```
Add the following entry at the hosts file
127.0.0.1          mysql-db
```


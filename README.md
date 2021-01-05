# Spring Data JPA
This project shows how to use Spring Data JPA using MySQL or Oracle databases
![Java CI](https://github.com/norberto-enomoto/enomoto-springdatajpa/workflows/Java%20CI/badge.svg)

## Run the Application
* `./mvnw spring-boot:run`
`or`
* `./mvnw package -DskipTests`
* `cd target`
* `java -jar accessing-data-mysql-0.0.1-SNAPSHOT.jar`

## MySQL - https://hub.docker.com/_/mysql/

Run the command bellow

* `docker run --name mysql -e MYSQL_ROOT_PASSWORD=123456 -d -p 3306:3306 mysql:5.7`
* `docker exec -it mysql bash`
* `mysql -u root -p`
* `create database db_example;`
* `create user 'springuser'@'%' identified by 'ThePassword';`
* `grant all on db_example.* to 'springuser'@'%';`
* `exit`
* `mvn spring-boot:run`

## Postgres - https://hub.docker.com/_/postgres/

Run the command bellow 

* `docker run --name postgres -e POSTGRES_PASSWORD=ThePassword -d -p 5432:5432 postgres`
* `docker exec -it postgres bash`
* `psql -U postgres`
* `CREATE DATABASE "db_example";`
* `CREATE USER springuser PASSWORD 'ThePassword';`
* `\q`
* `mvn spring-boot:run`

## Oracle - https://github.com/wnameless/docker-oracle-xe-11g

Run the command bellow

* `docker run --name oracle-xe -d -p 1521:1521 -p 8080:8080 wnameless/oracle-xe-11g-r2`
* `docker exec -it oracle-xe bash`
* `sqlplus`
* `user-name: system`
* `password: oracle`
* `CREATE USER springuser IDENTIFIED BY ThePassword;`
* `GRANT CONNECT,RESOURCE,DBA TO springuser;`
* `GRANT UNLIMITED TABLESPACE TO springuser;`
* `commit;`
* `exit;`
* `mvn spring-boot:run`

```
hostname: localhost
port: 1521
sid: xe
username: system
password: oracle
```

## hosts

```
Add the following entry at the hosts file
127.0.0.1          database
```

## Create the Spring Data JPA image

* `docker build --rm -f "Dockerfile" -t enomoto/springdatajpa:latest "."`

## docker-compose

* `docker-compose -f docker-compose-mysql.yml up -d`
* `docker-compose -f docker-compose-oracle.yml up -d`
* `docker-compose stop`
* `docker-compose start`

```
Tips for Linux environment
sudo mkdir /sys/fs/cgroup/systemd
sudo mount -t cgroup -o none,name=systemd cgroup /sys/fs/cgroup/systemd
```

## Important Links for Oracle JDBC driver
* `https://www.oracle.com/database/technologies/appdev/jdbc-downloads.html`
* `https://mkyong.com/maven/how-to-add-oracle-jdbc-driver-in-your-maven-local-repository/`

```
Installation for Windows or Linux
mvn install:install-file -Dfile="ojdbc7.jar" -DgroupId="com.oracle" -DartifactId="ojdbc7" -Dversion="12.1.0" -Dpackaging=jar
```
Norberto Hideaki Enomoto



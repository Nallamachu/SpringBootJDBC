# SpringBootJDBC

Technologies:
```
JDK-1.8
SpringBoot-2.0.4
DB-SQLServer
```

First step which you need to follow is Create database(TEMP) in SQLServer and execute the below queries to create customer_temp table and insert records into it.

```
create table customer_temp(id integer, name varchar(50),location varchar(100));

insert into customer_temp(id,name,location) values(1, 'Subbareddy','Bangalore');
insert into customer_temp(id,name,location) values(2, 'MuniGopalReddy','Bangalore');

select * from customer_temp;
```
Then import/download the source code into your eclipse project.

My POM.XML Dependencies are look like,
```xml
<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-jdbc</artifactId>
</dependency>
<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-web</artifactId>
</dependency>
<dependency>
  <groupId>com.microsoft.sqlserver</groupId>
  <artifactId>mssql-jdbc</artifactId>
  <version>6.2.2.jre8</version>
</dependency>
<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-devtools</artifactId>
  <optional>true</optional>
</dependency>
<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-test</artifactId>
  <scope>test</scope>
</dependency>
```
My application.properties look like below,
```
#Tomcat port changed from 8080 to 1234
server.port= 1234

# Here 'test' is the database name
spring.datasource.url=jdbc:sqlserver://localhost:1433;databaseName=TEMP
spring.datasource.username=sa
spring.datasource.password=sa
spring.datasource.driver-class-name=com.microsoft.sqlserver.jdbc.SQLServerDriver
```

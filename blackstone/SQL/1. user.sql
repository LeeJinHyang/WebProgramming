DROP TABLE IF EXISTS USER;

create table USER
(
 userid varchar(30) primary key,
 password varchar(30),
 name varchar(30),
 email varchar(50),
 phone varchar(30)
);
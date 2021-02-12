drop table if exists cost;

CREATE TABLE COST(
costno int primary key auto_increment,
EI varchar(2),
content varchar(50),
date datetime,
price int,
total int
);

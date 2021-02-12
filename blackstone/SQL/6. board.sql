DROP TABLE IF EXISTS BOARD;
DROP TABLE IF EXISTS COMMENT;

CREATE TABLE BOARD(
boardno int primary key auto_increment,
subject varchar(50),
userid varchar(30) references user(userid),
date datetime,
likes int
); 

create table comment(
commentno int primary key auto_increment,
boardno int references board(boardno),
userid varchar(30) references user(userid),
content varchar(300),
date datetime,
likes int
);
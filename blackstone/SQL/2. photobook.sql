DROP TABLE IF EXISTS PHOTOBOOK;
DROP TABLE IF EXISTS COMMENTP;

CREATE TABLE PHOTOBOOK(
photono int primary key auto_increment,
name varchar(30),
userid varchar(30) references USER(userid),
path varchar(60),
date datetime,
likes int
);
CREATE TABLE COMMENTP(
commentno int primary key auto_increment,
photono int references photobook(photono),
userid varchar(30) references USER(userid),
subject varchar(50),
content varchar(300),
date datetime,
likes int
); 
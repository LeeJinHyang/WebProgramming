DROP TABLE IF EXISTS TODOLIST;

CREATE TABLE TODOLIST(
todono int primary key auto_increment,
todocheck int,
content varchar(50),
date datetime
);
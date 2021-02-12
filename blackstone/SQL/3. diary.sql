Drop table if exists diary;

CREATE TABLE DIARY(
diaryNo int primary key auto_increment,
subject varchar(50),
content varchar(300),
path varchar(50),
date datetime
); 
--2023-05-17
create table member(
name varchar(100) not null,
id varchar(100) not null,
password varchar(100) not null,
email varchar(100) not null,
age int,
reg_date datetime default now(),
last_login datetime default null,
primary key(id)
);

--2023-05-18
create table board(
bno int not null auto_increment,
title varchar(100) not null,
writer varchar(100) not null,
content text,
reg_date datetime default now(),
read_count int default 0,
primary key(bno));

--2023-05-23
create table comment(
cno int not null auto_increment,
bno int default 0,
writer varchar(100) default "unknown",
content varchar(1000) not null,
reg_date datetime default now(),
primary key (cno));
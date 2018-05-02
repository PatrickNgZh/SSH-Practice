create database test;

use test;


create table student (
  id    int,
  name  nvarchar(20),
  photo varbinary(MAX)
);


insert into student(id,name) values
  (1, '小明'),
  (2, '小红');

drop table student;


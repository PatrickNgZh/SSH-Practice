create database test;

use test;


create table student (
  id    int primary key,
  name  nvarchar(20),
  photo varbinary(MAX)
);


insert into student(id,name) values
  (1, '小明'),
  (2, '小红');

drop table student;


create table tb_emails(
  email_id int primary key,
  student_id int foreign key references student(id),
  email_address varchar (30)
);

insert into tb_emails values
  (1,1,'123456@qq.com'),
  (2,1,'33333333@123.com'),
  (3,2,'666666666@126.com'),
  (4,1,'8888888888@hotmail.com');

drop table tb_emails;

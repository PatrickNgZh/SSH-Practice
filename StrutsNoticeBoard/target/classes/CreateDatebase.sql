create database NoticeBoard;

use NoticeBoard;

create table user_table (
  name     varchar(16) primary key ,
  password varchar(16)
);

insert into user_table values
  ('admin', '123'),
  ('peicong', '6978');

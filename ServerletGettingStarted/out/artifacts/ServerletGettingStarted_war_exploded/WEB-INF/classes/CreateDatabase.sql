CREATE DATABASE school;

GO;

USE school;

CREATE TABLE student (
  Sno    NVARCHAR(50) PRIMARY KEY,
  Sname  NVARCHAR(50),
  Ssex   NVARCHAR(10),
  Sage   INT,
  Sphone NVARCHAR(20),
  Sclass NVARCHAR(50)
);




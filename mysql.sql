CREATE DATABASE notice;

USE notice;

CREATE TABLE Nuser (
  UNO       INT PRIMARY KEY IDENTITY,
  Uname     NVARCHAR(50),
  Upassword NVARCHAR(50)
);

CREATE TABLE Type (
  Tno       INT PRIMARY KEY IDENTITY,
  Ttypename NVARCHAR(50)
);


CREATE TABLE Notice (
  Nno         INT PRIMARY KEY IDENTITY,
  Ntitle      NVARCHAR(200),
  Ncontent    NTEXT,
  Neditor     NVARCHAR(50),
  NcreateTime DATETIME,
  Ntype       INT FOREIGN KEY REFERENCES Type (Tno)
);




-- INSERT INTO Nuser VALUES (
--   ('','','','',)
-- )
INSERT INTO Nuser VALUES
  (1, 'admin', 'admin'),
  (2, 'a', 'a');

-- 插入Notice前要先插入Type因为外键
INSERT INTO Type VALUES
  (1, '教学通知'),
  (2, '科研通知'),
  (3, '招标公告');

INSERT INTO Notice VALUES
  (1, '放假通知', '元旦放假通知', '教务处', '2012-12-26', 1),
  (2, '录入成绩通知', '请考试结束的', '教务处', '2012-12-20', 1),
  (3, '招标公告', '我校实验中心', '设备处', '2012-11-15', 3);
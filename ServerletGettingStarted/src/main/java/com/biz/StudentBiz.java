package com.biz;

import java.util.List;

import com.bean.Student;
import com.dao.StudentDao;
import com.dao.StudentDaoImpl;

public class StudentBiz {
    StudentDao studentDao = new StudentDaoImpl();

    public List<Student> getAllSelectedInfo(String title) {
        return studentDao.getAllSelectedInfo(title);
    }

    public boolean createStudentInfo(String no, String name) {
        return studentDao.createStudentInfo(no, name);
    }
}

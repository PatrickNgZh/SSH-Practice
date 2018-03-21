package com.dao;

import java.util.List;

import com.bean.Student;


public interface StudentDao {
	
    List<Student> getAllSelectedInfo(String title);
    
    boolean createStudentInfo(String no,String name);
}

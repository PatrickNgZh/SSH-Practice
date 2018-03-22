package com.dao;

import java.util.List;

import com.bean.Student;


public interface StudentDao {
	
    List<Student> getAllSelectedInfo(String title);
    
    boolean createStudentInfo(String no,String name);

    List<String> getAllStudentName();

    Student getStudentInfoByName(String name);

    boolean insertBasicInfo(String no, String name);

    boolean deleteBySex(String sex);
}

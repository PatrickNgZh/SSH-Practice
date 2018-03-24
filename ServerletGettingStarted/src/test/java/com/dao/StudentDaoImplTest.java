package com.dao;

import org.junit.Test;

/**
 * @author peicong
 * @date 2018/3/21 0021
 */
public class StudentDaoImplTest {

    @Test
    public void getAllSelectedInfo() {
        System.out.println(new StudentDaoImpl().getAllSelectedInfo("信科"));
    }

    @Test
    public void createStudentInfo() {
    }


    @Test
    public void createStudentInfo1() {
        //注意resultSet的标号是从0开始的
        System.out.println(new StudentDaoImpl().getAllStudentName());
    }

    @Test
    public void getAllStudentName() {
    }

    @Test
    public void getStudentInfoByName() {
        System.out.println(new StudentDaoImpl().getStudentInfoByName("小红"));
    }

    @Test
    public void insertBasicInfo() {
        System.out.println(new StudentDaoImpl().insertBasicInfo("140101101519","小杨"));
    }

    @Test
    public void deleteBySex() {
        System.out.println(new StudentDaoImpl().deleteBySex("女"));
    }

    @Test
    public void retrieveStudentInfoBySno() {
        System.out.println(new StudentDaoImpl().retrieveStudentInfoBySno("130202104449"));
    }
}
package com.dao;

import org.junit.Test;

import static org.junit.Assert.*;

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
}
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
}
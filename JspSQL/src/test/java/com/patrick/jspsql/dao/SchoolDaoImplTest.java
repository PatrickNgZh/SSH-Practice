package com.patrick.jspsql.dao;

import org.junit.Test;

/**
 * @author peicong
 * @date 2018/3/16 0016
 */
public class SchoolDaoImplTest {

    @Test
    public void createData() {
        SchoolDao schoolDao = new SchoolDaoImpl();
        System.out.println(schoolDao.createData());
    }

    @Test
    public void deleteData() {
    }

    @Test
    public void updateData() {
        SchoolDao schoolDao = new SchoolDaoImpl();
        System.out.println(schoolDao.updateData());
    }

    @Test
    public void retrieveData() {
    }
}
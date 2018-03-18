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
        SchoolDao schoolDao = new SchoolDaoImpl();
        System.out.println(schoolDao.deleteData());
    }

    @Test
    public void updateData() {
        SchoolDao schoolDao = new SchoolDaoImpl();
        System.out.println(schoolDao.updateData());
    }

    @Test
    public void retrieveData() {
        SchoolDao schoolDao = new SchoolDaoImpl();
        schoolDao.retrieveData();
    }

    @Test
    public void deleteMenData() {
        SchoolDao schoolDao = new SchoolDaoImpl();
        System.out.println(schoolDao.deleteMenData());
    }

    @Test
    public void retrieveClassData() {
        SchoolDao schoolDao = new SchoolDaoImpl();
        schoolDao.retrieveClassData();
    }
}
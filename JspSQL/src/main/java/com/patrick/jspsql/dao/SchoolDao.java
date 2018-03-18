package com.patrick.jspsql.dao;

/**
 * @author peicong
 * @date 2018/3/16 0016
 */
public interface SchoolDao {
    boolean createData();

    boolean deleteData();

    boolean updateData();

    void retrieveData();

    boolean deleteMenData();

    void retrieveClassData();
}

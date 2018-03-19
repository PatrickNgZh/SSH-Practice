package com.dao;

import org.junit.Test;

/**
 * @author peicong
 * @date 2018/3/19 0019
 */
public class ConnectionManagerTest {

    @Test
    public void getConnection() {
        System.out.println(ConnectionManager.getConnection());
    }
}
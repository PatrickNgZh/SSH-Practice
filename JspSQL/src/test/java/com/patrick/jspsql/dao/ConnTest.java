package com.patrick.jspsql.dao;

import org.junit.Test;

/**
 * @author peicong
 * @date 2018/3/16 0016
 */
public class ConnTest {

    @Test
    public void getConnection() {
        System.out.println(Conn.getConnection());
    }
}
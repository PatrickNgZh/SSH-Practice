package com.patrick.strutsnoticeboard.dao;

import org.junit.Test;

public class UserDaoImplTest {

    @Test
    public void testVertifyUser() {
        System.out.println(new UserDaoImpl().vertifyUser("admin","123"));
        System.out.println(new UserDaoImpl().vertifyUser("lily","123"));
        System.out.println(new UserDaoImpl().vertifyUser("peicong","6978"));
    }
}

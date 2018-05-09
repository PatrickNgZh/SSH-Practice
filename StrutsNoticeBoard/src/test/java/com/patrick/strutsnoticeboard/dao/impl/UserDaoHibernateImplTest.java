package com.patrick.strutsnoticeboard.dao.impl;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author peicong
 * @date 2018/5/9 0009
 */
public class UserDaoHibernateImplTest {

    @Test
    public void vertifyUser() {
//        System.out.println(new UserDaoHibernateImpl().vertifyUser("admin", "admin"));
        System.out.println(new UserDaoHibernateImpl().vertifyUser("a", "admin"));
//        System.out.println(new UserDaoHibernateImpl().vertifyUser("a", "a"));
    }
}
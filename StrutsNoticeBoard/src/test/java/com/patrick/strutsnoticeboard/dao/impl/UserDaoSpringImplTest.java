package com.patrick.strutsnoticeboard.dao.impl;

import com.patrick.strutsnoticeboard.dao.NoticeDao;
import com.patrick.strutsnoticeboard.dao.UserDao;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoSpringImplTest {
    private static UserDao userDao;

    @Before
    public void setUp() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        userDao = (UserDao) applicationContext.getBean("userDao");
    }

    @Test
    public void vertifyUser() {
        System.out.println(new UserDaoHibernateImpl().vertifyUser("admin", "admin"));
        System.out.println(new UserDaoHibernateImpl().vertifyUser("a", "admin"));
    }
}
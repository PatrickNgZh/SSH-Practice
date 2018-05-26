package com.patrick.strutsnoticeboard.dao.impl;

import com.patrick.strutsnoticeboard.dao.TypeDao;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TypeDaoSpringImplTest {
    private static TypeDao typeDao;

    @Test
    public void getAllNoticeType() {
        System.out.println(typeDao.getAllNoticeType());
    }

    @Before
    public void setUp() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        typeDao = (TypeDao) applicationContext.getBean("typeDao");
    }
}
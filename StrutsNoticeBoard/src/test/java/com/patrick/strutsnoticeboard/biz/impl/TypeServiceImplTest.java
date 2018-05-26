package com.patrick.strutsnoticeboard.biz.impl;

import com.patrick.strutsnoticeboard.biz.TypeService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TypeServiceImplTest {
    private static TypeService typeService;

    @Before
    public void setUp() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        typeService = (TypeService) applicationContext.getBean("typeService");
    }

    @Test
    public void getAllNoticeType() {
        System.out.println(typeService.getAllNoticeType());
    }
}
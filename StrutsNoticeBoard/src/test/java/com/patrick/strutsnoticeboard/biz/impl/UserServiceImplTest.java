package com.patrick.strutsnoticeboard.biz.impl;

import com.patrick.strutsnoticeboard.biz.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceImplTest {
    private static UserService userService;

    @Before
    public void setUp() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        userService = (UserService) applicationContext.getBean("userService");
    }

    @Test
    public void vertifyUser() {
        System.out.println(userService.vertifyUser("admin","admin"));
    }
}
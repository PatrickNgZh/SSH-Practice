package com.patrick.strutsnoticeboard.dao.impl;

import com.patrick.strutsnoticeboard.dao.NoticeDao;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author peicong
 * @date 2018/5/23 0023
 */
public class NoticeDaoSpringImplTest {
    private static NoticeDao noticeDao;

    @Before
    public void setUp() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        noticeDao = (NoticeDao) applicationContext.getBean("noticeDao");
    }

    @Test
    public void getNoticeById() {
        System.out.println(noticeDao.getNoticeById(20));
        System.out.println(noticeDao.getNoticeById(3));
    }


}
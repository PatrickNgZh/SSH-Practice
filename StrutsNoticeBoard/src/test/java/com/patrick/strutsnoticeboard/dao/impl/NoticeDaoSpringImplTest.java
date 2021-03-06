package com.patrick.strutsnoticeboard.dao.impl;

import com.patrick.strutsnoticeboard.bean.Notice;
import com.patrick.strutsnoticeboard.dao.NoticeDao;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

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


    @Test
    public void getCount() {
        System.out.println(noticeDao.getCount());
    }

    @Test
    public void getAllNoticeList() {
    }

    @Test
    public void getNoticeByType() {
        System.out.println(noticeDao.getNoticeByType(1));
    }

    @Test
    public void deleteNotice() {
        System.out.println(noticeDao.deleteNotice(16));
    }

    @Test
    public void addNotice() {
        Notice notice = new Notice();
        notice.setTitle("testSpring");
        notice.setEditor("me");
        notice.setType(2);
        notice.setId(30);
        notice.setContent("blank");
        notice.setCreateTime(new Date());
        System.out.println(new NoticeDaoImpl().addNotice(notice));
    }

    @Test
    public void getPage() {
        System.out.println(noticeDao.getPage(3, 1));
        System.out.println(noticeDao.getPage(3, 2));
    }

    @Test
    public void updateNotice() {
        Notice notice = new Notice();
        notice.setTitle("testSpring");
        notice.setEditor("me");
        notice.setType(2);
        notice.setId(17);
        notice.setContent("这是更新测试");
        notice.setCreateTime(new Date());
        System.out.println(new NoticeDaoImpl().updateNotice(notice));
    }
}
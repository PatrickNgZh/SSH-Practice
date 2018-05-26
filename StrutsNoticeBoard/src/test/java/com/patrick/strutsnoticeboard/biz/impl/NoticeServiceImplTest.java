package com.patrick.strutsnoticeboard.biz.impl;

import com.patrick.strutsnoticeboard.bean.Notice;
import com.patrick.strutsnoticeboard.biz.NoticeService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class NoticeServiceImplTest {
    private static NoticeService noticeService;

    @Before
    public void setUp() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        noticeService = (NoticeService) applicationContext.getBean("noticeService");
    }

    @Test
    public void getNoticeByType() {
        System.out.println(noticeService.getNoticeByType(1));
    }

    @Test
    public void getNoticeById() {
        System.out.println(noticeService.getNoticeById(20));
        System.out.println(noticeService.getNoticeById(3));
    }

    @Test
    public void deleteNotice() {
        System.out.println(noticeService.deleteNotice(17));
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
        System.out.println(noticeService.addNotice(notice));
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
        System.out.println(noticeService.updateNotice(notice));
    }

    @Test
    public void getPage() {
        System.out.println(noticeService.getPage(3));
        System.out.println(noticeService.getPage(3));
    }

    @Test
    public void getCount() {
        System.out.println(noticeService.getCount());
    }
}
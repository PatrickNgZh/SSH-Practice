package com.patrick.strutsnoticeboard.dao.impl;

import com.patrick.strutsnoticeboard.bean.Notice;
import org.junit.Test;

import java.util.Date;

public class NoticeDaoHibernateImplTest {

    @Test
    public void getCount() {
        System.out.println(new NoticeDaoHibernateImpl().getCount());
    }

    @Test
    public void getAllNoticeList() {
    }

    @Test
    public void getNoticeByType() {
        System.out.println(new NoticeDaoHibernateImpl().getNoticeByType(1));
    }

    @Test
    public void getNoticeById() {
        System.out.println(new NoticeDaoHibernateImpl().getNoticeById(2));
    }

    @Test
    public void deleteNotice() {
        System.out.println(new NoticeDaoHibernateImpl().deleteNotice(16));
    }

    @Test
    public void addNotice() {
        for (int i = 0; i < 25; i++) {
            Notice notice = new Notice();
            notice.setTitle("testHibernate");
            notice.setEditor("me");
            notice.setType(2);
            notice.setId(30);
            notice.setContent("blank");
            notice.setCreateTime(new Date());
            System.out.println(new NoticeDaoImpl().addNotice(notice));
        }
    }

    @Test
    public void getPage() {
        System.out.println(new NoticeDaoHibernateImpl().getPage(3, 1));
        System.out.println(new NoticeDaoHibernateImpl().getPage(3, 2));
    }

    @Test
    public void updateNotice() {
        Notice notice = new Notice();
        notice.setTitle("testHibernate");
        notice.setEditor("me");
        notice.setType(2);
        notice.setId(17);
        notice.setContent("这是更新测试");
        notice.setCreateTime(new Date());
        System.out.println(new NoticeDaoImpl().updateNotice(notice));
    }
}
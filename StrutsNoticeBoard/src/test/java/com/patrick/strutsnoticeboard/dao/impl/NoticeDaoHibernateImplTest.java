package com.patrick.strutsnoticeboard.dao.impl;

import org.junit.Test;

import static org.junit.Assert.*;

public class NoticeDaoHibernateImplTest {

    @Test
    public void getCount() {
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
    }

    @Test
    public void addNotice() {
    }

    @Test
    public void getPage() {
    }

    @Test
    public void updateNotice() {
    }
}
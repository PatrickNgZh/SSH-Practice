package com.patrick.strutsnoticeboard.dao.impl;

import org.junit.Test;

public class TypeDaoHibernateImplTest {

    @Test
    public void getAllNoticeType() {
        System.out.println(new TypeDaoHibernateImpl().getAllNoticeType());
    }
}
package com.dao;

import com.bean.NoticeType;
import org.junit.Test;

import java.util.List;

/**
 * @author peicong
 * @date 2018/3/19 0019
 */
public class TypeDaoImplTest {

    @Test
    public void getAllNoticeType() {
        TypeDao typeDao = new TypeDaoImpl();
        List<NoticeType> list = typeDao.getAllNoticeType();
        for (NoticeType noticeType:list) {
            System.out.println(noticeType);
        }
    }
}
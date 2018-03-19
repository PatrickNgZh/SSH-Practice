package com.biz;

import java.util.List;

import com.bean.NoticeType;
import com.dao.TypeDao;
import com.dao.TypeDaoImpl;

public class TypeBiz {
    TypeDao typeDao = new TypeDaoImpl();

    public List<NoticeType> getAllNoticeType() {
        return typeDao.getAllNoticeType();
    }
}

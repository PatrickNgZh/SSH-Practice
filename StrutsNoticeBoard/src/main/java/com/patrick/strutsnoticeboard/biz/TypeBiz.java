package com.patrick.strutsnoticeboard.biz;

import com.patrick.strutsnoticeboard.bean.Type;
import com.patrick.strutsnoticeboard.dao.TypeDao;
import com.patrick.strutsnoticeboard.dao.impl.TypeDaoImpl;

import java.util.List;

public class TypeBiz {
    TypeDao typeDao = new TypeDaoImpl();

    public List<Type> getAllNoticeType() {
        return typeDao.getAllNoticeType();
    }
}

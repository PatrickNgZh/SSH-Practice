package com.patrick.strutsnoticeboard.biz;

import com.patrick.strutsnoticeboard.dao.UserDao;
import com.patrick.strutsnoticeboard.dao.impl.UserDaoHibernateImpl;

public class UserBiz {
    private UserDao userDao = new UserDaoHibernateImpl();

    public boolean vertifyUser(String name, String password) {
        return userDao.vertifyUser(name, password);
    }
}

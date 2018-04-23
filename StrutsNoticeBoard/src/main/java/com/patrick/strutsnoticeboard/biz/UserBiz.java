package com.patrick.strutsnoticeboard.biz;

import com.patrick.strutsnoticeboard.dao.UserDao;
import com.patrick.strutsnoticeboard.dao.UserDaoImpl;

public class UserBiz {
    private UserDao userDao = new UserDaoImpl();

    public boolean vertifyUser(String name, String password) {
        return userDao.vertifyUser(name, password);
    }
}

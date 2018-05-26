package com.patrick.strutsnoticeboard.biz.impl;

import com.patrick.strutsnoticeboard.biz.UserService;
import com.patrick.strutsnoticeboard.dao.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public boolean vertifyUser(String name, String password) {
        return userDao.vertifyUser(name, password);
    }
}

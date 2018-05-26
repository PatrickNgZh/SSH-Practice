package com.patrick.strutsnoticeboard.dao.impl;

import com.patrick.strutsnoticeboard.dao.UserDao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository("userDao")
@Transactional
public class UserDaoSpringImpl implements UserDao {
    @Autowired
    @Qualifier("sessionFactory")
    private SessionFactory sessionFactory;

    @Override
    public boolean vertifyUser(String name, String password) {
        Boolean judge = false;
        String hql = "from User user where user.name=:userName " +
                "and user.password=:userPassword";
        List list = sessionFactory.getCurrentSession().createQuery(hql)
                .setParameter("userName", name)
                .setParameter("userPassword", password)
                .list();

        if (list.isEmpty()) {
            judge = false;
        } else {
            judge = true;
        }
        return judge;
    }
}

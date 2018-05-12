package com.patrick.strutsnoticeboard.dao.impl;

import com.patrick.strutsnoticeboard.dao.UserDao;
import com.patrick.strutsnoticeboard.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

/**
 * @author peicong
 * @date 2018/5/9 0009
 */
public class UserDaoHibernateImpl implements UserDao {
    @Override
    public boolean vertifyUser(String name, String password) {
        Session session = null;
        Transaction transaction = null;
        Boolean judge = false;
        try {
            session = HibernateUtil.getSessionFactory().getCurrentSession();
            transaction = session.beginTransaction();

            String hql = "from User user where user.name=:userName " +
                    "and user.password=:userPassword";

            List list = session.createQuery(hql)
                    .setParameter("userName", name)
                    .setParameter("userPassword", password)
                    .list();

            if (list.isEmpty()) {
                judge = false;
            } else {
                judge = true;
            }

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
            return false;
        }
        return judge;
    }
}

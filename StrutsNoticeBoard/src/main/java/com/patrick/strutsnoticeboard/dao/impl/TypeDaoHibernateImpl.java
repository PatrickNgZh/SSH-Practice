package com.patrick.strutsnoticeboard.dao.impl;

import com.patrick.strutsnoticeboard.bean.Type;
import com.patrick.strutsnoticeboard.dao.TypeDao;
import com.patrick.strutsnoticeboard.utils.HibernateConfiguration;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class TypeDaoHibernateImpl implements TypeDao {

    @Override
    public List<Type> getAllNoticeType() {
        Session session = null;
        Transaction transaction = null;
        List list;
        try {
            SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();

            String hql = "from Type";

            Query query = session.createQuery(hql);
            list = query.list();

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
            return null;
        } finally {
            if (session != null) session.close();
        }
        return list;
    }

}

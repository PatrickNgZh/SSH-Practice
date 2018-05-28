package com.patrick.hibernategettingstarted.dao;

import com.patrick.hibernategettingstarted.beam.Email;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.junit.Before;
import org.junit.Test;

/**
 * @author peicong
 * @date 2018/5/27 0027
 */
public class QBCTest {
    private static SessionFactory sessionFactory;

    @Before
    public void setUp() throws Exception {
        Configuration configuration = new Configuration();
        configuration.configure();//加载Hibernate配置文件
        sessionFactory = configuration.buildSessionFactory(
                new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build());
    }

    @Test
    public void testQBC() {
        Session session = null;
        session = sessionFactory.openSession();
        Criteria criteria = session.createCriteria(Email.class);
        criteria.add(Restrictions.gt("id", 2));
        criteria.add(Restrictions.between("id", 4, 5));
        for (Object object : criteria.list()) {
            System.out.println((Email)object);
        }
        session.close();
    }
}

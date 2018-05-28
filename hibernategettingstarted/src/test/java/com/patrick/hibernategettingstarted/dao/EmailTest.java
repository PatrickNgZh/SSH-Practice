package com.patrick.hibernategettingstarted.dao;

import com.patrick.hibernategettingstarted.beam.Email;
import com.patrick.hibernategettingstarted.beam.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.junit.Before;
import org.junit.Test;

/**
 * @author peicong
 * @date 2018/5/4 0004
 */
public class EmailTest {
    private static SessionFactory sessionFactory;

    @Test
    public void testDoubleEnd() {
        Session session = null;
        Transaction transaction = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            Email email = (Email) session.get(Email.class, 3);
            System.out.println(email.getStudent());
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        } finally {
            if (session != null) session.close();
        }
    }

    @Test
    public void testRelation() {
        Session session = null;
        Transaction transaction = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();

            Student student = new Student();
            student.setName("张三");

            Email email = new Email();
            email.setAddress("987654321@qq.com");
            email.setId(5);

            email.setStudent(student);

            session.save(email);
            session.save(student);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        } finally {
            if (session != null) session.close();
        }
    }

    @Before
    public void setUp() throws Exception {
        Configuration configuration = new Configuration();
        configuration.configure();//加载Hibernate配置文件
        sessionFactory = configuration.buildSessionFactory(
                new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build());
    }
}

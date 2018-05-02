package com.patrick.hibernategettingstarted.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.junit.Before;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class StudentTest {
    private static SessionFactory sessionFactory;


    @Test
    public void testSaveStudent() {
        Session session = null;
        Transaction transaction = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();

            Student student = new Student();
            student.setName("张三");
            session.save(student);

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        } finally {
            if (session != null) session.close();
        }
    }

    @Test
    public void testSavePhoto() {
        Session session = null;
        Transaction transaction = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();

            Student student = new Student();
            student.setName("张三");

            //以下保存个人照片
            InputStream inputStream = new FileInputStream("test.jpg");
            byte[] photo = new byte[inputStream.available()];
            inputStream.read(photo);
            inputStream.close();
            student.setPic(photo);
            session.save(student);

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        } finally {
            if (session != null) session.close();
            sessionFactory.close();
        }
    }

    @Test
    public void testGetPhoto() {
        Session session = null;
        Transaction transaction = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();

            Student student = (Student) session.get(Student.class, 3);
            byte[] photo = student.getPic();
            OutputStream outputStream = new FileOutputStream("output.jpg");
            outputStream.write(photo);
            outputStream.close();

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        } finally {
            if (session != null) session.close();
        }
    }

    @Test
    public void testUpdate() {
        Session session = null;
        Transaction transaction = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();

            Student student = new Student();
            student.setId(1);
            student.setName("张三");
            session.update(student);

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        } finally {
            if (session != null) session.close();
        }
    }

    @Test
    public void testDelete() {
        Session session = null;
        Transaction transaction = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();

            Student student = new Student();
            student.setId(4);
            session.delete(student);

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        } finally {
            if (session != null) session.close();
        }
    }

    @Test
    public void testLoad() {
        Session session = null;
        Transaction transaction = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();

            Student student = (Student) session.load(Student.class, 1);//lazy-load在.hbm.xml中配置
            System.out.println("======开始发送SQL了吗？==========");
            System.out.println("OID是：" + student.getId());
            System.out.println("Class对象是：" + student.getClass());
            System.out.println("学生姓名是：" + student.getName());
            System.out.println(student);

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        } finally {
            if (session != null) session.close();
        }
    }

    @Test
    public void testGet() {
        Session session = null;
        Transaction transaction = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();

            Student student = (Student) session.get(Student.class, 1);//get一开始就执行sql
            System.out.println("======开始发送SQL了吗？==========");
            System.out.println("OID是：" + student.getId());
            System.out.println("Class对象是：" + student.getClass());
            System.out.println("学生姓名是：" + student.getName());
            System.out.println(student);

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
package com.patrick.strutsnoticeboard.utils;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    //实例化Configuration类
    private static Configuration configuration = new Configuration();
    //声明SessionFactory接口
    private static SessionFactory sessionFactory;


    static {
        //读取默认的配置文件hibernate.cfg.xml
        configuration.configure();
        //实例化SessionFactory
        sessionFactory = configuration.buildSessionFactory(
                new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build());

    }

    //创建私有的无参的HibernateSessionFactory构造函数
    private HibernateUtil() {
    }


    //SessionFactory对象的getXXX()方法
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    //configFile属性的getXXX()方法
    public static Configuration getConfiguration() {
        return configuration;
    }

}
package com.patrick.strutsnoticeboard.utils;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateConfiguration {
    private static SessionFactory sessionFactory;
    private static HibernateConfiguration ourInstance = new HibernateConfiguration();

    public static HibernateConfiguration getInstance() {
        return ourInstance;
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    private HibernateConfiguration() {
        Configuration configuration = new Configuration();
        configuration.configure();//加载Hibernate配置文件
        sessionFactory = configuration.buildSessionFactory(
                new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build());
    }
}

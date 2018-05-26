package com.patrick.strutsnoticeboard.dao.impl;

import com.patrick.strutsnoticeboard.bean.Type;
import com.patrick.strutsnoticeboard.dao.TypeDao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository("typeDao")
@Transactional
public class TypeDaoSpringImpl implements TypeDao {
    @Autowired
    @Qualifier("sessionFactory")
    private SessionFactory sessionFactory;

    @Override
    public List<Type> getAllNoticeType() {
        String hql = "from Type";
        return (List<Type>)sessionFactory
                .getCurrentSession()
                .createQuery(hql)
                .list();
    }
}

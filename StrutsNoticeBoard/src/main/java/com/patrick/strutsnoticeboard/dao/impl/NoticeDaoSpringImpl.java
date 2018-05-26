package com.patrick.strutsnoticeboard.dao.impl;

import com.patrick.strutsnoticeboard.bean.Notice;
import com.patrick.strutsnoticeboard.bean.Type;
import com.patrick.strutsnoticeboard.dao.NoticeDao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author peicong
 * @date 2018/5/23 0023
 */
@Repository("noticeDao")
@Transactional
public class NoticeDaoSpringImpl implements NoticeDao {
    @Autowired
    @Qualifier("sessionFactory")
    private SessionFactory sessionFactory;

    @Override
    public long getCount() {
        String hql = "select count(*) from Notice";
        return (long) sessionFactory.getCurrentSession().createQuery(hql).uniqueResult();
    }

    @Override
    public List<Notice> getAllNoticeList() {
        return null;
    }

    @Override
    public List<Notice> getNoticeByType(int typeId) {
        Type type = (Type) sessionFactory.getCurrentSession().get(Type.class, typeId);
        return type.getNoticeList();
    }

    @Override
    public Notice getNoticeById(int noticeId) {
        String hql = "from Notice notice where notice.id=:noticeId";
        return (Notice) sessionFactory.getCurrentSession()
                .createQuery(hql)
                .setInteger("noticeId", noticeId)
                .uniqueResult();
    }

    @Override
    public boolean deleteNotice(int noticeId) {
        Notice notice = (Notice) sessionFactory.getCurrentSession().get(Notice.class, noticeId);
        sessionFactory.getCurrentSession().delete(notice);
        return true;
    }

    @Override
    public boolean addNotice(Notice notice) {
        sessionFactory.getCurrentSession().save(notice);
        return true;
    }

    @Override
    public List<Notice> getPage(int pageSize, int pageIndex) {
        String hql = "from Notice notice order by notice.id";
        return (List<Notice>) sessionFactory.getCurrentSession()
                .createQuery(hql)
                .setFirstResult((pageIndex - 1) * pageSize)  //(pageIndex-1)*pageSize
                .setMaxResults(pageSize)   //pageSize
                .list();
    }

    @Override
    public boolean updateNotice(Notice notice) {
        sessionFactory.getCurrentSession().update(notice);
        return true;
    }
}

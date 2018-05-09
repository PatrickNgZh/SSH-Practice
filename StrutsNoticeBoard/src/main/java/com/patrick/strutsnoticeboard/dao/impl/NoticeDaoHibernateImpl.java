package com.patrick.strutsnoticeboard.dao.impl;

import com.patrick.strutsnoticeboard.bean.Notice;
import com.patrick.strutsnoticeboard.bean.Type;
import com.patrick.strutsnoticeboard.dao.NoticeDao;
import com.patrick.strutsnoticeboard.utils.HibernateConfiguration;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class NoticeDaoHibernateImpl implements NoticeDao {
    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public List<Notice> getAllNoticeList() {
        return null;
    }

    @Override
    public List<Notice> getNoticeByType(int typeId) {
        Session session = null;
        Transaction transaction = null;
        List list;
        try {
            SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();

            Type type = (Type) session.get(Type.class, typeId);

            list = type.getNoticeList();

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

    @Override
    public Notice getNoticeById(int noticeId) {
        Session session = null;
        Transaction transaction = null;
        Notice notice;
        try {
            SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();

            String hql = "from Notice notice where notice.id=:noticeId";

            notice = (Notice) session.createQuery(hql)
                    .setInteger("noticeId", noticeId)
                    .uniqueResult();

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
            return null;
        } finally {
            if (session != null) session.close();
        }
        return notice;
    }

    @Override
    public boolean deleteNotice(int noticeId) {
        return false;
    }

    @Override
    public boolean addNotice(Notice notice) {
        return false;
    }

    @Override
    public List<Notice> getPage(int pageSize, int pageIndex) {
        return null;
    }

    @Override
    public boolean updateNotice(Notice notice) {
        return false;
    }
}

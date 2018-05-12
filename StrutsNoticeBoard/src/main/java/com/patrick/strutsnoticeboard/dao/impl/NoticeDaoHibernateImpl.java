package com.patrick.strutsnoticeboard.dao.impl;

import com.patrick.strutsnoticeboard.bean.Notice;
import com.patrick.strutsnoticeboard.bean.Type;
import com.patrick.strutsnoticeboard.dao.NoticeDao;
import com.patrick.strutsnoticeboard.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class NoticeDaoHibernateImpl implements NoticeDao {
    @Override
    public long getCount() {
        Session session = null;
        Transaction transaction = null;
        long ans = 0;
        try {
            session = HibernateUtil.getSessionFactory().getCurrentSession();
            transaction = session.beginTransaction();

            String hql = "select count(*) from Notice";
            ans = (long) session.createQuery(hql).uniqueResult();

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
            return 0;
        }
        return ans;
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
            session = HibernateUtil.getSessionFactory().getCurrentSession();
            transaction = session.beginTransaction();

            Type type = (Type) session.get(Type.class, typeId);

            list = type.getNoticeList();

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
            return null;
        }
        return list;
    }

    @Override
    public Notice getNoticeById(int noticeId) {
        Session session = null;
        Transaction transaction = null;
        Notice notice;
        try {
            session = HibernateUtil.getSessionFactory().getCurrentSession();
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
        }
        return notice;
    }

    @Override
    public boolean deleteNotice(int noticeId) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = HibernateUtil.getSessionFactory().getCurrentSession();
            transaction = session.beginTransaction();

            Notice notice = (Notice) session.get(Notice.class, noticeId);

            session.delete(notice);

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean addNotice(Notice notice) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = HibernateUtil.getSessionFactory().getCurrentSession();
            transaction = session.beginTransaction();

            session.save(notice);

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public List<Notice> getPage(int pageSize, int pageIndex) {
        Session session = null;
        Transaction transaction = null;
        List list;
        try {
            session = HibernateUtil.getSessionFactory().getCurrentSession();
            transaction = session.beginTransaction();

            String hql = "from Notice notice order by notice.id";
            list = session.createQuery(hql)
                    .setFirstResult((pageIndex - 1) * pageSize)  //(pageIndex-1)*pageSize
                    .setMaxResults(pageSize)   //pageSize
                    .list();

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
            return null;
        }
        return list;
    }

    @Override
    public boolean updateNotice(Notice notice) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = HibernateUtil.getSessionFactory().getCurrentSession();
            transaction = session.beginTransaction();

            session.update(notice);

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
            return false;
        }
        return true;
    }
}

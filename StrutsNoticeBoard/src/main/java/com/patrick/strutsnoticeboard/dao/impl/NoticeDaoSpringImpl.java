package com.patrick.strutsnoticeboard.dao.impl;

import com.patrick.strutsnoticeboard.bean.Notice;
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
        return 0;
    }

    @Override
    public List<Notice> getAllNoticeList() {
        return null;
    }

    @Override
    public List<Notice> getNoticeByType(int typeId) {
        return null;
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

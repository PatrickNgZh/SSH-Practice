package com.patrick.strutsnoticeboard.biz;

import com.patrick.strutsnoticeboard.bean.Notice;
import com.patrick.strutsnoticeboard.dao.NoticeDao;
import com.patrick.strutsnoticeboard.dao.impl.NoticeDaoHibernateImpl;
import com.patrick.strutsnoticeboard.dao.impl.NoticeDaoImpl;

import java.util.List;

/**
 * @author peicong
 * @date 2018/4/24 0024
 */
public class NoticeBiz {
    private final static double PAGE_SIZE = 6.0;
    //  private NoticeDao noticeDao = new NoticeDaoImpl();
    private NoticeDao noticeDao = new NoticeDaoHibernateImpl();

    public List<Notice> getNoticeByType(int typeId) {
        return noticeDao.getNoticeByType(typeId);
    }

    public Notice getNoticeById(int noticeId) {
        return noticeDao.getNoticeById(noticeId);
    }

    public List<Notice> getAllNoticeList() {
        return noticeDao.getAllNoticeList();
    }

    public boolean deleteNotice(int noticeId) {
        return noticeDao.deleteNotice(noticeId);
    }

    public boolean addNotice(Notice notice) {
        return noticeDao.addNotice(notice);
    }

    public List<Notice> getPage(int pageIndex) {
        return noticeDao.getPage((int) PAGE_SIZE, pageIndex);
    }

    public boolean updateNotice(Notice notice) {
        return noticeDao.updateNotice(notice);
    }

    public int getCount() {
        double ans = noticeDao.getCount() / PAGE_SIZE;
        return (int) Math.ceil(ans);
    }
}

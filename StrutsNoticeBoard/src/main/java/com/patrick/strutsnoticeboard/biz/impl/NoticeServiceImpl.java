package com.patrick.strutsnoticeboard.biz.impl;

import com.patrick.strutsnoticeboard.bean.Notice;
import com.patrick.strutsnoticeboard.biz.NoticeService;
import com.patrick.strutsnoticeboard.dao.NoticeDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;

@Service("noticeService")
@Transactional
public class NoticeServiceImpl implements NoticeService {
    @Resource
    private NoticeDao noticeDao;
    private final static double PAGE_SIZE = 6.0;

    @Override
    public List<Notice> getNoticeByType(int typeId) {
        return noticeDao.getNoticeByType(typeId);
    }

    @Override
    public Notice getNoticeById(int noticeId) {
        return noticeDao.getNoticeById(noticeId);
    }

    @Override
    public boolean deleteNotice(int noticeId) {
        return noticeDao.deleteNotice(noticeId);
    }

    @Override
    public boolean addNotice(Notice notice) {
        return noticeDao.addNotice(notice);
    }

    @Override
    public boolean updateNotice(Notice notice) {
        return noticeDao.updateNotice(notice);
    }

    @Override
    public List<Notice> getPage(int pageIndex) {
        return noticeDao.getPage((int) PAGE_SIZE, pageIndex);
    }

    @Override
    public int getCount() {
        double ans = noticeDao.getCount() / PAGE_SIZE;
        return (int) Math.ceil(ans);
    }
}

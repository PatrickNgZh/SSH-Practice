package com.patrick.strutsnoticeboard.dao;

import com.patrick.strutsnoticeboard.bean.Notice;

import java.util.List;

/**
 * @author peicong
 * @date 2018/4/23 0023
 */
public interface NoticeDao {
    long getCount();

    List<Notice> getAllNoticeList();

    List<Notice> getNoticeByType(int typeId);

    Notice getNoticeById(int noticeId);

    boolean deleteNotice(int noticeId);

    boolean addNotice(Notice notice);

    List<Notice> getPage(int pageSize, int pageIndex);

    boolean updateNotice(Notice notice);
}

package com.patrick.strutsnoticeboard.biz;

import com.patrick.strutsnoticeboard.bean.Notice;

import java.util.List;

public interface NoticeService {
    List<Notice> getNoticeByType(int typeId);

    Notice getNoticeById(int noticeId);

    boolean deleteNotice(int noticeId);

    boolean addNotice(Notice notice);

    boolean updateNotice(Notice notice);

    List<Notice> getPage(int pageIndex);

    int getCount();
}

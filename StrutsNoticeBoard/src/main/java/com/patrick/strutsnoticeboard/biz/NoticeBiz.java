package com.patrick.strutsnoticeboard.biz;

import com.patrick.strutsnoticeboard.bean.Notice;
import com.patrick.strutsnoticeboard.dao.NoticeDao;
import com.patrick.strutsnoticeboard.dao.impl.NoticeDaoImpl;

import java.util.List;

/**
 * @author peicong
 * @date 2018/4/24 0024
 */
public class NoticeBiz {
  NoticeDao noticeDao = new NoticeDaoImpl();

  public List<Notice> getNoticeByType(int typeId){
    return noticeDao.getNoticeByType(typeId);
  }

  public Notice getNoticeById(int noticeId){
    return noticeDao.getNoticeById(noticeId);
  }
}

package com.patrick.strutsnoticeboard.dao;

import com.patrick.strutsnoticeboard.bean.Notice;

import java.util.List;

/**
 * @author peicong
 * @date 2018/4/23 0023
 */
public interface NoticeDao {
  int getCount();

  List<Notice> getAllNoticeList();

  List<Notice> getNoticeByType(int typeId);

  Notice getNoticeById(int noticeId);
}

package com.patrick.strutsnoticeboard.controller;

import com.opensymphony.xwork2.ActionSupport;
import com.patrick.strutsnoticeboard.bean.Notice;
import com.patrick.strutsnoticeboard.biz.NoticeBiz;

/**
 * @author peicong
 * @date 2018/4/24 0024
 */
public class NoticeDetailController extends ActionSupport {
  private int id;
  private Notice notice;

  @Override
  public String execute() {
    NoticeBiz noticeBiz = new NoticeBiz();
    notice = noticeBiz.getNoticeById(id);
    return "showDetail";
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Notice getNotice() {
    return notice;
  }

  public void setNotice(Notice notice) {
    this.notice = notice;
  }
}

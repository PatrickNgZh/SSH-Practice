package com.patrick.strutsnoticeboard.controller;

import com.opensymphony.xwork2.ActionSupport;
import com.patrick.strutsnoticeboard.bean.Notice;
import com.patrick.strutsnoticeboard.biz.NoticeService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * @author peicong
 * @date 2018/4/24 0024
 */
@Controller("noticeDetailController")
@Scope("request")
public class NoticeDetailController extends ActionSupport {
  private int id;
  private Notice notice;

    @Resource
    private NoticeService noticeService;

  @Override
  public String execute() {
    notice = noticeService.getNoticeById(id);
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

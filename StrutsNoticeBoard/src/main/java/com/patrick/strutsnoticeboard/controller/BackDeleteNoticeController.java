package com.patrick.strutsnoticeboard.controller;

import com.opensymphony.xwork2.ActionSupport;
import com.patrick.strutsnoticeboard.biz.NoticeService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller("backDeleteNoticeController")
@Scope("request")
public class BackDeleteNoticeController extends ActionSupport {
    private int pageIndex;
    private int id;

    @Resource
    private NoticeService noticeService;

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String execute() {
        noticeService.deleteNotice(id);
        return SUCCESS;
    }
}

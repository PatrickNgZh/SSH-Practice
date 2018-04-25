package com.patrick.strutsnoticeboard.controller;

import com.opensymphony.xwork2.ActionSupport;
import com.patrick.strutsnoticeboard.bean.Notice;
import com.patrick.strutsnoticeboard.biz.NoticeBiz;

import java.util.List;

public class BackGetAllNoticesController extends ActionSupport {
    private List<Notice> list;

    public List<Notice> getList() {
        return list;
    }

    public void setList(List<Notice> list) {
        this.list = list;
    }

    @Override
    public String execute() {
        NoticeBiz noticeBiz = new NoticeBiz();
        list = noticeBiz.getAllNoticeList();
        return SUCCESS;
    }
}

package com.patrick.strutsnoticeboard.controller;

import com.opensymphony.xwork2.ActionSupport;
import com.patrick.strutsnoticeboard.biz.NoticeBiz;

public class BackDeleteNoticeController extends ActionSupport {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String execute() {
        NoticeBiz noticeBiz = new NoticeBiz();
        noticeBiz.deleteNotice(id);
        return SUCCESS;
    }
}

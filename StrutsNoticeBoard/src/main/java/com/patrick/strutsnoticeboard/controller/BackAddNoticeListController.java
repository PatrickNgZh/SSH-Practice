package com.patrick.strutsnoticeboard.controller;

import com.opensymphony.xwork2.ActionSupport;
import com.patrick.strutsnoticeboard.bean.Type;
import com.patrick.strutsnoticeboard.biz.TypeBiz;

import java.util.List;

public class BackAddNoticeListController extends ActionSupport {
    private List<Type> list;

    public List<Type> getList() {
        return list;
    }

    public void setList(List<Type> list) {
        this.list = list;
    }

    @Override
    public String execute() {
        TypeBiz typeBiz = new TypeBiz();
        list = typeBiz.getAllNoticeType();
        return SUCCESS;
    }
}

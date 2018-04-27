package com.patrick.strutsnoticeboard.controller;

import com.opensymphony.xwork2.ActionSupport;
import com.patrick.strutsnoticeboard.bean.Notice;
import com.patrick.strutsnoticeboard.bean.Type;
import com.patrick.strutsnoticeboard.biz.NoticeBiz;
import com.patrick.strutsnoticeboard.biz.TypeBiz;

import java.util.List;

public class BackAlertNoticeController extends ActionSupport {
    private int id;
    private int pageIndex;
    private Notice notice;
    private List<Type> list;
    private Type type;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public List<Type> getList() {
        return list;
    }

    public void setList(List<Type> list) {
        this.list = list;
    }

    public Notice getNotice() {
        return notice;
    }

    public void setNotice(Notice notice) {
        this.notice = notice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    @Override
    public String execute() {
        NoticeBiz noticeBiz = new NoticeBiz();
        notice = noticeBiz.getNoticeById(id);
        TypeBiz typeBiz = new TypeBiz();
        list = typeBiz.getAllNoticeType();

        for (Type temp : list) {
            if (temp.getId() == notice.getType()) {
                type = temp;
                list.remove(temp);
                break;
            }
        }

        return SUCCESS;
    }
}

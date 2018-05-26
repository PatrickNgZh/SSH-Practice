package com.patrick.strutsnoticeboard.controller;

import com.opensymphony.xwork2.ActionSupport;
import com.patrick.strutsnoticeboard.bean.Notice;
import com.patrick.strutsnoticeboard.biz.NoticeService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.Date;

@Controller("backAlertNoticeReturnController")
@Scope("request")
public class BackAlertNoticeReturnController extends ActionSupport {
    private int pageIndex;
    private int id;
    private String title;
    private String editor;
    private String content;
    private Date date;
    private int type;

    @Resource
    private NoticeService noticeService;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
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
        Notice notice = new Notice();
        notice.setId(id);
        notice.setTitle(title);
        notice.setContent(content);
        notice.setEditor(editor);
        notice.setCreateTime(new Date());
        notice.setType(type);
        noticeService.updateNotice(notice);
        return SUCCESS;
    }
}

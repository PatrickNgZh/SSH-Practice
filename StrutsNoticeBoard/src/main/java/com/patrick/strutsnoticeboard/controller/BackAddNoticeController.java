package com.patrick.strutsnoticeboard.controller;

import com.opensymphony.xwork2.ActionSupport;
import com.patrick.strutsnoticeboard.bean.Notice;
import com.patrick.strutsnoticeboard.biz.NoticeService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @author peicong
 * @date 2018/4/25 0025
 */

@Controller("backAddNoticeController")
@Scope("request")
public class BackAddNoticeController extends ActionSupport {
    private Notice notice;
    private String title;
    private String content;
    private String editor;
    private int type;
    private Date createTime;

    @Resource
    private NoticeService noticeService;

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Notice getNotice() {
        return notice;
    }

    public void setNotice(Notice notice) {
        this.notice = notice;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    @Override
    public String execute() {
        notice = new Notice();
        notice.setTitle(title);
        notice.setContent(content);
        notice.setEditor(editor);
        notice.setType(type);
        notice.setCreateTime(createTime);
        noticeService.addNotice(notice);
        return SUCCESS;
    }
}

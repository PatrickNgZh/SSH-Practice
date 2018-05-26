package com.patrick.strutsnoticeboard.controller;

import com.opensymphony.xwork2.ActionSupport;
import com.patrick.strutsnoticeboard.bean.Notice;
import com.patrick.strutsnoticeboard.biz.NoticeService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;

@Controller("backGetNoticePageController")
@Scope("request")
public class BackGetNoticePageController extends ActionSupport {
    private List<Notice> list;
    private int pageIndex;
    private int totalPage;

    @Resource
    private NoticeService noticeService;

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public List<Notice> getList() {
        return list;
    }

    public void setList(List<Notice> list) {
        this.list = list;
    }

    @Override
    public String execute() {
        totalPage = noticeService.getCount();
        if (pageIndex < 1) {
            pageIndex = 1;
        }
        if (pageIndex > totalPage) {
            pageIndex = totalPage;
        }
        list = noticeService.getPage(pageIndex);
        return SUCCESS;
    }
}

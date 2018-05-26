package com.patrick.strutsnoticeboard.controller;

import com.opensymphony.xwork2.ActionSupport;
import com.patrick.strutsnoticeboard.bean.Notice;
import com.patrick.strutsnoticeboard.biz.NoticeService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author peicong
 * @date 2018/4/24 0024
 */
@Controller("noticeInfoController")
@Scope("request")
public class NoticeInfoController extends ActionSupport {
    int typeId;
    private List<Notice> list;

    @Resource
    private NoticeService noticeService;

    @Override
    public String execute() {
        list = noticeService.getNoticeByType(typeId);
        System.out.println(typeId);
        System.out.println(list);
        return "typeInfo";
    }

    public List<Notice> getList() {
        return list;
    }

    public void setList(List<Notice> list) {
        this.list = list;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }
}

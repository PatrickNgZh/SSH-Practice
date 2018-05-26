package com.patrick.strutsnoticeboard.controller;

import com.opensymphony.xwork2.ActionSupport;
import com.patrick.strutsnoticeboard.bean.Type;
import com.patrick.strutsnoticeboard.biz.TypeService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;

@Controller("backAddNoticeListController")
@Scope("request")
public class BackAddNoticeListController extends ActionSupport {
    private List<Type> list;

    @Resource
    private TypeService typeService;

    public List<Type> getList() {
        return list;
    }

    public void setList(List<Type> list) {
        this.list = list;
    }

    @Override
    public String execute() {
        list = typeService.getAllNoticeType();
        return SUCCESS;
    }
}

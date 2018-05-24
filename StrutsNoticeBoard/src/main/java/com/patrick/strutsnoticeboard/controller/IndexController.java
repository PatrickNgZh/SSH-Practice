package com.patrick.strutsnoticeboard.controller;

import com.opensymphony.xwork2.ActionSupport;
import com.patrick.strutsnoticeboard.bean.Type;
import com.patrick.strutsnoticeboard.biz.TypeBiz;
import org.apache.struts2.interceptor.ApplicationAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author peicong
 * @date 2018/4/24 0024
 */
@Controller("indexController")
@Scope("request")
public class IndexController extends ActionSupport implements ApplicationAware {
    private List<Type> list;
    private String date;
    private Map<String, Object> application;


    public List<Type> getList() {
        return list;
    }

    public void setList(List<Type> list) {
        this.list = list;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public void setApplication(Map<String, Object> map) {
        this.application = map;
    }

    @Override
    public String execute() {
        if (application.get("count") == null) {
            application.put("count", 0);
        } else {
            int count = Integer.parseInt(application.get("count").toString());
            application.put("count", count + 1);
        }
        TypeBiz typeBiz = new TypeBiz();
        list = typeBiz.getAllNoticeType();
        SimpleDateFormat formater = new SimpleDateFormat("yyyy年MM月dd日");
        date = formater.format(new Date());
        return SUCCESS;
    }


}

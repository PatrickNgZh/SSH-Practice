package com.patrick.strutsnoticeboard.controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.patrick.strutsnoticeboard.bean.Type;
import com.patrick.strutsnoticeboard.biz.TypeService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author peicong
 * @date 2018/4/24 0024
 */
@Controller("logoutController")
@Scope("request")
public class LogoutController extends ActionSupport {

    @Resource
    private TypeService typeService;

    private List<Type> list;

    public List<Type> getList() {
        return list;
    }

    public void setList(List<Type> list) {
        this.list = list;
    }

    @Override
  public String execute() {
    Map session = ActionContext.getContext().getSession();
    session.remove("username");
    list = typeService.getAllNoticeType();
    return SUCCESS;
  }
}

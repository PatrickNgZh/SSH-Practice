package com.patrick.strutsnoticeboard.controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.patrick.strutsnoticeboard.biz.UserBiz;

import java.util.Map;

/**
 * @author peicong
 * @date 2018/4/24 0024
 */
public class LoginVertifyController extends ActionSupport {
  private String name;
  private String password;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public String execute() {
    UserBiz userBiz = new UserBiz();
    if (userBiz.vertifyUser(name, password)) {
      Map session = ActionContext.getContext().getSession();
      session.put("username", name);
      return "success";
    } else {
      return "input";
    }
  }
}

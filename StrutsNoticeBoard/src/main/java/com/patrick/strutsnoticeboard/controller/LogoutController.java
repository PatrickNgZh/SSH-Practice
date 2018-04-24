package com.patrick.strutsnoticeboard.controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Map;

/**
 * @author peicong
 * @date 2018/4/24 0024
 */
public class LogoutController extends ActionSupport {

  @Override
  public String execute() {
    Map session = ActionContext.getContext().getSession();
    session.remove("username");
    return SUCCESS;
  }
}

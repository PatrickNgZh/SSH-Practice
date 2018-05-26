package com.patrick.strutsnoticeboard.controller;

import com.opensymphony.xwork2.ActionSupport;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 * @author peicong
 * @date 2018/4/24 0024
 */
@Controller("noticeInitController")
@Scope("request")
public class NoticeInitController extends ActionSupport {
  public String init() {
    return "init";
  }
}

package com.patrick.strutsnoticeboard.controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.patrick.strutsnoticeboard.biz.UserService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author peicong
 * @date 2018/4/24 0024
 */
@Controller("loginVertifyController")
@Scope("request")
public class LoginVertifyController extends ActionSupport {
    private String username;
    private String password;

    @Resource
    private UserService userService;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String execute() {
        if (userService.vertifyUser(username, password)) {
            Map session = ActionContext.getContext().getSession();
            session.put("username", username);
            return "success";
        } else {
            return "input";
        }
    }

    @Override
    public void validate() {
        if (username == null || "".equals(username.trim())) {
            this.addFieldError("username","用户名不能为空！");
        }
        if (password == null || "".equals(password.trim())) {
            this.addFieldError("password","密码不能为空");
        }
    }
}


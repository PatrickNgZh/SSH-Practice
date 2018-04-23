package com.patrick.strutsnoticeboard.controller;

import com.patrick.strutsnoticeboard.biz.UserBiz;

public class LoginController {
    private String name;
    private String password;
    private UserBiz userBiz = new UserBiz();


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

    public String execute(){
        if (userBiz.vertifyUser(name,password)){
            return "success";
        }else{
            return "input";
        }
    }

}

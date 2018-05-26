package com.patrick.strutsnoticeboard.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller("loginController")
@Scope("request")
public class LoginController  {

    public String execute(){
        return "input";
    }

}

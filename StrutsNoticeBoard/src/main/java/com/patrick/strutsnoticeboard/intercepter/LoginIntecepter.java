package com.patrick.strutsnoticeboard.intercepter;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

/**
 * @author peicong
 * @date 2018/4/24 0024
 */
public class LoginIntecepter extends AbstractInterceptor {

  @Override
  public String intercept(ActionInvocation invocation) throws Exception {
    Map session = invocation.getInvocationContext().getSession();
    String username = (String) session.get("username");
    if (username == null || username.equals("")) {
      session.put("errorMsg", "您还未登陆，请登陆！");
      return invocation.invoke();
    } else {
      return "success";
    }
  }


}

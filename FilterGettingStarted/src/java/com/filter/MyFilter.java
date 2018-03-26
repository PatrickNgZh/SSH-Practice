package com.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author peicong
 * @date 2018/3/26 0026
 */
@WebFilter(filterName = "MyFilter",urlPatterns = "/jsp/*")
public class MyFilter implements Filter {
    @Override
    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        HttpSession httpSession = ((HttpServletRequest) req).getSession();
        if (httpSession.getAttribute("user") == null) {
            PrintWriter out = resp.getWriter();
            out.print("<script language=javascript>" +
                    "alert('您还没有登陆！');" +
                    "window.location.href='../index.jsp';" +
                    "</script>");
        }
        chain.doFilter(req, resp);
    }

    @Override
    public void init(FilterConfig config) throws ServletException {

    }

}

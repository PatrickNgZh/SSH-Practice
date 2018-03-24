package com.serverletgettingstarted;

import com.bean.Student;
import com.dao.StudentDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author peicong
 * @date 2018/3/24 0024
 */
@WebServlet(name = "CompareServlet", urlPatterns = "/QueryInfo/CompareServlet")
public class CompareServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Student student = new StudentDaoImpl()
                .retrieveStudentInfoBySno(request.getParameter("studentNo"));
        if (student.getSno() == null) {
            request.setAttribute("message", "查询失败，请重新输入学号");
            request.getRequestDispatcher("query.jsp").forward(request,response);
        } else {
            request.setAttribute("studentInfo", student);
            request.getRequestDispatcher("success.jsp").forward(request,response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

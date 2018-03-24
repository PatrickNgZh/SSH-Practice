package com.serverletgettingstarted;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class LoginServerlet
 */
@WebServlet("/LoginServerlet")
public class LoginServerlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServerlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		out.print("您的名字：");
		out.println(request.getParameter("username")+"<br>");
		out.print("您的性别：");
		out.println(request.getParameter("sex")+"<br>");
		out.print("您喜欢的颜色：");
		String[] list=request.getParameterValues("color");
		for(String myColor:list){
			out.print(myColor+"&nbsp;&nbsp;");
		}
		out.println("<br>");
		out.print("您来自的城市：");
		out.println(request.getParameter("city")+"<br>");
		out.close();
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

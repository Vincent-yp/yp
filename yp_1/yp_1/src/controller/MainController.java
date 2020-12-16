package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class MainController extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			request.setCharacterEncoding("utf-8");
			String er = request.getParameter("err");
//			System.out.println(er);
			if (er.equals("urlerror")) {
			request.setAttribute("error", "抱歉，请先登录才能访问该资源!");
	  		request.getRequestDispatcher("/error.jsp").forward(request, response);
			}else if (er.equals("loginout")) {
				response.sendRedirect("../login.html");
				request.getSession().invalidate();
			}
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}

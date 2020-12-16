package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.jms.Session;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.User;
import Dao.LoginDao;



public class Login extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			request.setCharacterEncoding("utf-8");//统一编码
			//接受前台数据
			String name = request.getParameter("username");
			String pwd  = request.getParameter("password");
			String vimage = request.getParameter("vimage");//用户输入的验证码
			String verity = (String)request.getSession().getAttribute("verity");
			
			//调用user数据库
			//校验验证码
			if (verity.toLowerCase().equals(vimage.toLowerCase())) {
				//验证码通过，则判断用户名或密码
				LoginDao lDao = new LoginDao();
				User user = lDao.loginSelect(name, pwd);
				if (user!=null && name.equals(user.getName())) {
					//用户名正确，判断密码
					if (pwd.equals(user.getPassWord())) {
						//跳转到main.jsp,并携带用户名,将用户名放进session，
//						并判断是否从login登陆进来，否则跳转到error.jsp
						request.getSession().setAttribute("chiName", user.getChiName());
						request.getRequestDispatcher("/main.jsp").forward(request, response);
					}else {
					request.setAttribute("error", "抱歉，您输入的密码不正确！");
					request.getRequestDispatcher("/error.jsp").forward(request, response);
					}
				}else{
					request.setAttribute("error", "抱歉，您输入的用户名不存在！");
					request.getRequestDispatcher("/error.jsp").forward(request, response);
				}
			}else{
				request.setAttribute("error", "抱歉，您输入的验证码不正确！");
				request.getRequestDispatcher("/error.jsp").forward(request, response);
			}	
	}

}

package controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.DownLoadDao;
import entity.DownloadList;


public class DownLoadController extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			request.setCharacterEncoding("utf-8");
			response.setContentType("text/html;charset=UTF-8");
			String download = request.getParameter("download");
			String path = request.getParameter("path");//文件下载地址
			if (download.equals("select")) {
				List<DownloadList> dList = new ArrayList<DownloadList>();
				DownLoadDao dao = new DownLoadDao();
				dList = dao.ListSelect();
				request.setAttribute("list", dList);
				request.getRequestDispatcher("/downLoadList.jsp").forward(request, response);
			}else{

				response.setContentType(getServletContext().getMimeType(path.substring(9)));

	
				response.setHeader("Content-Disposition", "attachment;filename="+new String(path.substring(9).getBytes("gb2312"),"ISO-8859-1"));

				String fullFileName = getServletContext().getRealPath("/"+path);
				InputStream in = new FileInputStream(fullFileName);
				OutputStream out = response.getOutputStream();
				//写文件
				int b;
				while ((b=in.read())!=-1) {
					out.write(b);
				}
				in.close();
				out.close();
			}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}

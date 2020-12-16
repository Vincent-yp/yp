package cn.servlet;

import cn.entity.Browser;
import cn.service.BrowserService;
import flexjson.JSONSerializer;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/browsersServlet")
public class BrowsersServlet extends HttpServlet {
    //调用业务层
    private BrowserService browserService = new BrowserService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json;charset=utf-8");
        //得到数据库中的浏览器对象
        List<Browser> browsers = browserService.findAllBrowser();
        //创建json转换器对象
        JSONSerializer serializer = new JSONSerializer();
        String result = serializer.serialize(browsers);//转换
        PrintWriter out1 = response.getWriter();
        out1.write(result);
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        this.doPost(request, response);
    }

}
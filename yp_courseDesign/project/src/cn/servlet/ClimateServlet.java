package cn.servlet;

import cn.entity.Climate;
import cn.service.ClimateService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/climateServlet")
public class ClimateServlet extends HttpServlet {
    //调用业务层
    private  ClimateService climateService=new ClimateService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //指定输出到浏览器上的类型
        response.setContentType("text/json;charset=utf-8");
        //得到打印流进行输出
        PrintWriter out=response.getWriter();
        //得到数据库中所有气温对象
        List<Climate> climates = climateService.findAllClimate();
        //将数据转成json对象以后输出到浏览器上
        String json = climateService.toJson(climates);
        out.write(json);
        System.out.println(climates);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}

package cn.servlet;

import cn.entity.MilkPowder;
import cn.service.MilkPowderService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/milkPowderServlet")
public class MilkPowderServlet extends HttpServlet {
    //调用业务层
    private MilkPowderService milkPowderService=new MilkPowderService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //指定输出到浏览器上的类型
        response.setContentType("text/json;charset=utf-8");
        //得到打印流进行输出
        PrintWriter out=response.getWriter();
        //得到数据库中所有奶粉对象
        List<MilkPowder> milkPowders=milkPowderService.findAllMilkPowder();
        //将数据转成json对象以后输出到浏览器上
        String json = milkPowderService.toJson(milkPowders);
        out.write(json);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}

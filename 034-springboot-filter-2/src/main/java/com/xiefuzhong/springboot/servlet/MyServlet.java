package com.xiefuzhong.springboot.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/encoding")
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

       resp.getWriter().println("世界您好，Hello");
       //统一设置浏览器编码格式【这个不写的话光靠字符过滤器，有些浏览器还是乱码】
        resp.setContentType("text/html;charset=utf-8");
       resp.getWriter().flush();
       resp.getWriter().close();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}

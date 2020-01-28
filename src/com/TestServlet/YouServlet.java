package com.TestServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebServlet(urlPatterns = "/youservlet")
public class YouServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        System.out.println("get请求");
        System.out.println("跳转成功，进入YOUServlet");
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().write("跳转成功，进入YOUServlet");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
        System.out.println("post请求");
        System.out.println("跳转成功，进入YOUServlet");
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().write("跳转成功，进入YOUServlet");

    }
}

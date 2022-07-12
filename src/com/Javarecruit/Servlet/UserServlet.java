package com.Javarecruit.Servlet;

import com.Javarecruit.Service.ServiceImpl.UserServiceImpl;
import com.Javarecruit.Service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "UserServlet",urlPatterns = {"/UserServlet"})
public class UserServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        PrintWriter out=response.getWriter();
        String uname = request.getParameter("uname");
        String upwd = request.getParameter("upwd");
        UserService us=new UserServiceImpl();
        String login = us.login(uname, upwd);
        if ("成功".equals(login)){
            out.print("hello");
        }else{
            out.print("la");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}

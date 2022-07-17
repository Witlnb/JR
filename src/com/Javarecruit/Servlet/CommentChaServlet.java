package com.Javarecruit.Servlet;

import com.Javarecruit.Service.CommentService;
import com.Javarecruit.Service.ServiceImpl.CommentServiceImpl;
import com.Javarecruit.pojo.Comment;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CommentChaServlet",urlPatterns = {"/CommentChaServlet"})
public class CommentChaServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        PrintWriter out=response.getWriter();
        String uid = request.getParameter("uid");
        int i = Integer.parseInt(uid);
        CommentService cs=new CommentServiceImpl();
        String s = cs.chaComment(i);
        if ("成功".equals(s)){

        }else{
            out.print("no");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}

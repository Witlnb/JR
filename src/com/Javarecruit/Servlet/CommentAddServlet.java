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
import java.sql.PreparedStatement;

@WebServlet(name = "CommentAddServlet",urlPatterns = {"/CommentAddServlet"})
public class CommentAddServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        PrintWriter out=response.getWriter();
        String cmtscontent = request.getParameter("cmtscontent");
        String uid = request.getParameter("uid");
        int i = Integer.parseInt(uid);
        String cmtstime = request.getParameter("cmtstime");
        int i1 = Integer.parseInt(cmtstime);
        Comment c=new Comment();
        c.setCmtscontent(cmtscontent);
        c.setUid(i);
        c.setCmtstime(i1);
        CommentService cs=new CommentServiceImpl();
        String s = cs.addComment(c);
        if ("成功".equals(s)){
            out.print("yes");
        }else{
            out.print("no");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}

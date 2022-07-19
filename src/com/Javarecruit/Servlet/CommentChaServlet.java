package com.Javarecruit.Servlet;

import com.Javarecruit.Service.CommentService;
import com.Javarecruit.Service.ServiceImpl.CommentServiceImpl;
import com.Javarecruit.pojo.Comment;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CommentChaServlet",urlPatterns = {"/CommentChaServlet"})
public class CommentChaServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out=response.getWriter();
        HttpSession session = request.getSession();
        String uid = request.getParameter("uid");
        int i = Integer.parseInt(uid);
        CommentService cs=new CommentServiceImpl();
        Comment comment = cs.chaComment(i);
        System.out.println(comment.getCmtscontent());
        session.setAttribute("uid",comment);
        if (comment.getUid()!=null){
            request.getRequestDispatcher("CommentCshow.jsp").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}

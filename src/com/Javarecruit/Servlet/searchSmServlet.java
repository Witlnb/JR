package com.Javarecruit.Servlet;

import com.Javarecruit.Service.ServiceImpl.ShowServiceImpl;
import com.Javarecruit.pojo.Show;
import com.sun.org.apache.regexp.internal.RE;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "searchSmServlet", value = "/searchSmServlet")
public class searchSmServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        HttpSession session=request.getSession();
        String a = request.getParameter("searchOne");
        ShowServiceImpl ss = new ShowServiceImpl();
        List<Show> s = ss.queryBlure(a);
        if (!s.isEmpty()){
            session.setAttribute("search",s);
        }
        response.sendRedirect("Search.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}

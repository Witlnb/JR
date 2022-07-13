package com.Javarecruit.Servlet;

import com.Javarecruit.Service.ServiceImpl.ShowServiceImpl;
import com.Javarecruit.Service.ShowService;
import com.Javarecruit.pojo.Show;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "ShowRServlet",urlPatterns = {"/ShowRServlet"})
public class ShowRServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        ShowService showService = new ShowServiceImpl();
        List<Show> all = showService.All();
        request.setAttribute("showList",all);
        request.getRequestDispatcher("ShowR.jsp").forward(request,response);
        out.flush();
        out.close();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}

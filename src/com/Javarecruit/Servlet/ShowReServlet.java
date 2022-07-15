package com.Javarecruit.Servlet;

import com.Javarecruit.Service.ServiceImpl.ShowServiceImpl;
import com.Javarecruit.Service.ShowService;
import com.Javarecruit.Util.Page;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "ShowReServlet",urlPatterns = {"/ShowReServlet"})
public class ShowReServlet extends javax.servlet.http.HttpServlet {
    Page page = null;
    @Override
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();

        String testindex = request.getParameter("index");
        int index = 1;
        if (testindex != null){
            index = Integer.parseInt(testindex);
        }
        ShowService showService = new ShowServiceImpl();
        if (page == null){
            page = showService.getPageByIndex(index,10);
        }else if (index >=1 && index <=page.getTotalPageCount()){
            page = showService.getPageByIndex(index,10);
        }
        request.setAttribute("page",page);
        request.getRequestDispatcher("ShowPage.jsp").forward(request,response);
        out.flush();
        out.close();
    }
    @Override
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doPost(request,response);
    }
}

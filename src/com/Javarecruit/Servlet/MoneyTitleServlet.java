package com.Javarecruit.Servlet;

import com.Javarecruit.Service.ServiceImpl.ShowServiceImpl;
import com.Javarecruit.pojo.Show;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "MoneyTitleServlet",urlPatterns = {"/MoneyTitleServlet"})
public class MoneyTitleServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
        String name=request.getParameter("title");
        Integer num= Integer.parseInt(request.getParameter("money"));
        ShowServiceImpl ssi=new ShowServiceImpl();
        List<Show> sh=ssi.titleMoney(num,name);
        request.setAttribute("show",sh);
        if("".equals(name)||num==0){
            request.getRequestDispatcher("MoneyTitle.jsp").forward(request,response);
        }else{
            request.getRequestDispatcher("MoneyTitleServlet.jsp").forward(request,response);
        }
        out.flush();
        out.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}

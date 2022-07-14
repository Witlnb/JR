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

@WebServlet(name = "RangeServlet",urlPatterns = {"/RangeServlet"})
public class RangeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
        Integer one= Integer.parseInt(request.getParameter("one"));
        Integer two= Integer.parseInt(request.getParameter("two"));
        ShowServiceImpl ssi=new ShowServiceImpl();
        List<Show> ss=ssi.twoMoney(one,two);
        request.setAttribute("money",ss);
        System.out.println(one);
        System.out.println(two);
        if(one==0||two==0||one>two){
            request.getRequestDispatcher("Range.jsp").forward(request,response);
        }else{
            request.getRequestDispatcher("RangeServlet.jsp").forward(request,response);
        }
        out.flush();
        out.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}

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
        String money=request.getParameter("o");
        System.out.println(money);
        System.out.println(money.substring(0,4));
        System.out.println(money.substring(5,9));
        Integer one= Integer.parseInt(money.substring(0,4));
        Integer two= Integer.parseInt(money.substring(5,9));
        ShowServiceImpl ssi=new ShowServiceImpl();
        List<Show> ss=ssi.twoMoney(one,two);
        request.setAttribute("money",ss);
        if(one==0000&&two==0000) {
            request.getRequestDispatcher("Hall.jsp").forward(request, response);
        }
        out.flush();
        out.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}

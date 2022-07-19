package com.Javarecruit.Servlet;

import com.Javarecruit.Service.ServiceImpl.ShowServiceImpl;
import com.Javarecruit.pojo.Show;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "RangeServlet",urlPatterns = {"/RangeServlet"})
public class RangeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session=request.getSession();
        PrintWriter out=response.getWriter();
        Integer one= Integer.parseInt(request.getParameter("one"));
        Integer two= Integer.parseInt(request.getParameter("two"));
        ShowServiceImpl ssi=new ShowServiceImpl();
        List<Show> ss=ssi.twoMoney(one,two);
        session.setAttribute("money",ss);
        request.getRequestDispatcher("ShowRange.jsp").forward(request,response);
        if(one==0||two==0||one>=two) {
            request.getRequestDispatcher("ShowRange.jsp").forward(request, response);
        }
        out.flush();
        out.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}

package com.Javarecruit.Servlet;

import com.Javarecruit.Service.ServiceImpl.ShowServiceImpl;
import com.Javarecruit.pojo.Hr;
import com.Javarecruit.pojo.Show;
import com.sun.org.apache.regexp.internal.RE;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "ShowHIServlet", value = "/ShowHIServlet")
public class ShowHIServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        HttpSession session=request.getSession();
        ShowServiceImpl ss = new ShowServiceImpl();
        Hr h = (Hr) session.getAttribute("LoginH");
        List<Show> showComp = ss.showComp(h.getCompanyid());
        System.out.println(ss.showComp(h.getCompanyid()));
        if(!showComp.isEmpty()){
            session.setAttribute("showComp", showComp);
            response.sendRedirect("ShowHItwo.jsp");

        }else{
            response.sendRedirect("ShowHI.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}

package com.Javarecruit.Servlet;

import com.Javarecruit.Service.HrService;
import com.Javarecruit.Service.ServiceImpl.HrServiceImpl;
import com.Javarecruit.pojo.Hr;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "HrEnrollServlet",urlPatterns = {"/HrEnrollServlet"})
public class HrEnrollServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        request.getParameter("company");
        request.getParameter("cshow");
        request.getParameter("hmoney");
        request.getParameter("caddress");
        request.getParameter("phone");
        Hr hr = new Hr();
        HrService hrService = new HrServiceImpl();
        String s = hrService.enroll(hr);
        if (s.equals("成功")){
            request.getRequestDispatcher("").forward(request,response);
        }else {
            response.sendRedirect("HrEnroll.jsp");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}

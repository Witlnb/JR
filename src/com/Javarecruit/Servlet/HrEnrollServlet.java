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
        String company = request.getParameter("company");
        String cshow = request.getParameter("cshow");
        String hmoney = request.getParameter("hmoney");
        String caddress = request.getParameter("caddress");
        String phone = request.getParameter("phone");
        int parseInt = Integer.parseInt(hmoney);
        Hr hr = new Hr();
        hr.setCompany(company);
        hr.setCshow(cshow);
        hr.setHmoney(parseInt);
        hr.setCaddress(caddress);
        hr.setPhone(phone);
        HrService hrService = new HrServiceImpl();
        int enroll = hrService.enroll(hr);
        if (enroll!=0){
            request.getRequestDispatcher("HrLogin.jsp").forward(request,response);
        }else {
            response.sendRedirect("HrEnroll.jsp");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}

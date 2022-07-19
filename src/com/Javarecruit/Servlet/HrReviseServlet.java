package com.Javarecruit.Servlet;

import com.Javarecruit.Service.ServiceImpl.HrServiceImpl;
import com.Javarecruit.Service.ServiceImpl.UserServiceImpl;
import com.Javarecruit.pojo.Hr;
import com.Javarecruit.pojo.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HrReviseServlet", value = "/HrReviseServlet")
public class HrReviseServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");

        Integer  companyid = Integer.parseInt(request.getParameter("companyid"));
        Integer   hmoney = Integer.parseInt(request.getParameter("hmoney"));

        String cshow = request.getParameter("cshow");
        String company = request.getParameter("company");
        String phone = request.getParameter("phone");
        String caddress = request.getParameter("caddress");
        Hr h = new Hr();
        h.setPhone(phone);
        h.setCaddress(caddress);
        h.setCompany(company);
        h.setCompanyid(companyid);
        h.setCshow(cshow);
        h.setHmoney(hmoney);
        HrServiceImpl hh = new HrServiceImpl();
        PrintWriter out = response.getWriter();
        int a = hh.reviseHr(h);
        if (a > 0){
            response.sendRedirect("ShowHItwo.jsp");
        }else{
            response.sendRedirect("HrRevise.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}

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
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        Integer companyid = Integer.parseInt(request.getParameter("companyid"));
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
        HrServiceImpl hh = new HrServiceImpl();
        PrintWriter out = response.getWriter();
        out.println(hh.reviseHr(h));
        out.flush();
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}

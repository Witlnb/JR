package com.Javarecruit.Servlet;

import com.Javarecruit.Service.ServiceImpl.UserServiceImpl;
import com.Javarecruit.pojo.User;
import com.sun.org.apache.regexp.internal.RE;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.server.UID;

@WebServlet(name = "ReviseUserServlet", value = "/ReviseUserServlet")
public class ReviseUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        System.out.println("到这里了");
        UserServiceImpl uu =  new UserServiceImpl();
        PrintWriter out = response.getWriter();
        User u = new User();
//        Integer uid = Integer.parseInt(request.getParameter("uid"));
        String upwd = request.getParameter("upwd");
        String phone = request.getParameter("phone");
        String mark = request.getParameter("mark");
        String email = request.getParameter("email");
        String study = request.getParameter("study");
        String job = request.getParameter("job");
        String address = request.getParameter("address");
        String personal = request.getParameter("personal");
        Integer a = 1;
        u.setUid(a);
        u.setUpwd(upwd);
        u.setPhone(phone);
        u.setMark(mark);
        u.setEmail(email);
        u.setStudy(study);
        u.setJob(job);
        u.setAddress(address);
        u.setPersonal(personal);
        uu.revise(u);
        out.flush();
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}

package com.Javarecruit.Servlet;

import com.Javarecruit.Service.ServiceImpl.UserServiceImpl;
import com.Javarecruit.Service.UserService;
import com.Javarecruit.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "EnrollServlet",urlPatterns = {"/EnrollServlet"})
public class EnrollServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String uname = request.getParameter("uname");
        String upwd = request.getParameter("upwd");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String nid = request.getParameter("nid");
        String study = request.getParameter("study");
        String job = request.getParameter("job");
        String sex = request.getParameter("sex");
        String address = request.getParameter("address");
        String personal = request.getParameter("personal");
        User user = new User();
        user.setUname(uname);
        user.setUpwd(upwd);
        user.setPhone(phone);
        user.setEmail(email);
        user.setNid(nid);
        user.setStudy(study);
        user.setJob(job);
        user.setSex(sex);
        user.setAddress(address);
        user.setPersonal(personal);
        UserService userService = new UserServiceImpl();
        int enroll = userService.enroll(user);
        if (enroll > 0){
            request.getRequestDispatcher("First.html").forward(request,response);
        }else {
            response.sendRedirect("Enroll.jsp");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}

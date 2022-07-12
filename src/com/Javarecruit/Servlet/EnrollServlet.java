package com.Javarecruit.Servlet;

import com.Javarecruit.Service.ServiceImpl.UserServiceImpl;
import com.Javarecruit.Service.UserService;
import com.Javarecruit.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "EnrollServlet",urlPatterns = {"/EnrollServlet"})
public class EnrollServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("");
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
        UserService userService = new UserServiceImpl();
        String enroll = userService.enroll(user);
        if (enroll.equals("成功")){
            request.getRequestDispatcher("").forward(request,response);
        }else {
            response.sendRedirect("UserEnroll.jsp");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}

package com.Javarecruit.Servlet;

import com.Javarecruit.Service.HrService;
import com.Javarecruit.Service.ServiceImpl.HrServiceImpl;
import com.Javarecruit.Service.ServiceImpl.UserServiceImpl;
import com.Javarecruit.Service.UserService;
import com.Javarecruit.pojo.Hr;
import com.Javarecruit.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "UserServlet",urlPatterns = {"/UserServlet"})
public class UserServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        PrintWriter out=response.getWriter();
        HttpSession session = request.getSession();
        String phone = request.getParameter("phone");
        String upwd = request.getParameter("upwd");
        UserService us=new UserServiceImpl();
        String login = us.login(phone, upwd);
        HrService hs=new HrServiceImpl();
        String login1 = hs.login(phone,upwd);
        if ("成功".equals(login)){
            session.setAttribute("phone",phone);
            session.setAttribute("upwd",upwd);
//           request.getRequestDispatcher("showMore.jsp").forward(request,response);
            out.print("hello");
        }else if ("成功".equals(login1)){
                out.print("老板");
        }else{
            response.sendRedirect("UserLogin.jsp");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}

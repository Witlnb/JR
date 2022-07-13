package com.Javarecruit.Servlet;

import com.Javarecruit.Service.ServiceImpl.UserServiceImpl;
import com.Javarecruit.pojo.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Pattern;

@WebServlet(name = "FUserReviseServlet", value = "/FUserReviseServlet")
public class FUserReviseServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        String upwd = request.getParameter("upwd");
        String phone = request.getParameter("phone");
        String mark = request.getParameter("mark");
        String email = request.getParameter("email");
        String study = request.getParameter("study");
        String job = request.getParameter("job");
        String address = request.getParameter("address");
        String personal = request.getParameter("personal");
        User u = new User();
        if(upwd != null){
            String ju = "^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{6,20}$";
            if(upwd.matches(ju)){
                out.println("ok");
            }else{
                out.println("密码至少包含 数字和英文，长度6-20,不能有符号");
            }
        }else if (phone != null){
            String regex = "0\\d{2,3}[-]?\\d{7,8}|0\\d{2,3}\\s?\\d{7,8}|13[0-9]\\d{8}|15[1089]\\d{8}";
            if(phone.matches(regex)){
                out.println("ok");
            }else{
                out.println("请输入正确的电话号码");
            }
        }else if (mark != null){
            u.setMark(mark);
        }else if (email != null){
            String e = "^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$";
            if(email.matches(e)){
                out.println("ok");
            }else {
               out.println("请输入正确的邮箱号码");
            }
        }else if (study != null){
            out.println("ok");
        }else if (job != null){
            u.setJob(job);
        }else if (address != null){
            String add = "^.+ (区|镇).+ (路|街).+号.+号楼.+单元.+ (室|户).*$";
            if(address.matches(add)){
                out.println("ok");
            }else {
                out.println("请输入详细住址");
            }
            u.setAddress(address);
        }else if (personal != null){
            System.out.println("ok");
        }else{
        }
        out.flush();
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}

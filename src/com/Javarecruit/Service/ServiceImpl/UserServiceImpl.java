package com.Javarecruit.Service.ServiceImpl;

import com.Javarecruit.Dao.DaoImpl.UserDaoImpl;
import com.Javarecruit.Dao.UserDao;
import com.Javarecruit.Service.UserService;
import com.Javarecruit.pojo.Comment;
import com.Javarecruit.pojo.User;

public class UserServiceImpl implements UserService {
    /**
     * 修改
     * @return 返回信息
     */
    @Override
    public int revise(User u) {
        UserDao userDao = new UserDaoImpl();
        return userDao.revise(u);
    }

    /**
     * 用户注册
     * @param user
     * @return
     */
    @Override
    public int enroll(User user) {
        UserDao userDao = new UserDaoImpl();
        int user1 = userDao.addByUser(user);
        return user1;
    }

    /**
     * 用户登录
     * @param uname 用户名
     * @param pwd 用户密码
     * @return
     */
    @Override
    public User login(String uname, String pwd) {
        UserDao ud=new UserDaoImpl();
        User name = ud.querybynamepwd(uname, pwd);
        if (name!=null){
            return name;
        }else{
            return null;
        }
    }

    @Override
    public String Comment(Comment c) {
        UserDao ud=new UserDaoImpl();
        int addcomment = ud.addcomment(c);
        if (addcomment==0){
           return "失败" ;
        }
        return "成功";
    }
}

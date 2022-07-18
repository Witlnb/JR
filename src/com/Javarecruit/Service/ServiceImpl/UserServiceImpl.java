package com.Javarecruit.Service.ServiceImpl;

import com.Javarecruit.Dao.DaoImpl.UserDaoImpl;
import com.Javarecruit.Dao.UserDao;
import com.Javarecruit.Service.UserService;
import com.Javarecruit.pojo.Comment;
import com.Javarecruit.pojo.User;

import java.util.List;

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
     * @param phone 用户名
     * @param pwd 用户密码
     * @return
     */
    @Override
    public String login(String phone, String pwd) {
        UserDao ud=new UserDaoImpl();
        User name = ud.querybynamepwd(phone, pwd);
        if (name.getPhone()!=null&&name.getUpwd()!=null){
            return "成功";
        }else{
            return "失败";
        }
    }

    @Override
    public String addComment(Comment c) {
        UserDao ud=new UserDaoImpl();
        int addcomment = ud.addcomment(c);
        if (addcomment==0){
           return "失败" ;
        }
        return "成功";
    }

    @Override
    public String deleteComment(int commentid) {
        UserDao ud=new UserDaoImpl();
        int deletecomment = ud.deletecomment(commentid);
        if (deletecomment==0){
            return "成功";
        }
        return "失败";
    }
    
    @Override
    public User sessionUser(String phone, String pwd) {
        UserDao ud=new UserDaoImpl();
        User uu = ud.querybynamepwd(phone, pwd);
        return uu;
    }

    /**
     *展示全部的方法
     * @return 展示结果
     */
    @Override
    public List<User> queryAll() {
        UserDaoImpl udi=new UserDaoImpl();
        List<User> us=udi.queryAll();
        return us;
    }


}

package com.Javarecruit.Service;

import com.Javarecruit.pojo.Comment;
import com.Javarecruit.pojo.User;

public interface UserService {
    /**
     * 修改
     * @return 修改提示
     */
    int revise(User u);

    /**
     * 用户注册
     * @param user
     * @return
     */
    int enroll(User user);

    /**
     * 登录
     * @param uname 用户名
     * @param pwd 用户密码
     * @return
     */
    User login(String uname,String pwd);

    /**
     * 用户评论
     * @param c 评论对象
     * @return 评论成功失败
     */
    String Comment (Comment c);
}

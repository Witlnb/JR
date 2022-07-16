package com.Javarecruit.Dao;

import com.Javarecruit.pojo.Comment;
import com.Javarecruit.pojo.Hr;
import com.Javarecruit.pojo.User;

public interface UserDao {
    /**
     * 修改用户信息
     * @return 返回确认数值
     */
    int revise(User u);

    /**
     * 新增
     * @param user 用户
     * @return 返回受影响行数
     */
    int addByUser(User user);

    /**
     * 查询
     * @param uname 用户名
     * @param pwd 密码
     * @return 结果
     */
    public User querybynamepwd(String uname, String pwd);

    /**
     * 新增评论
     * @param c 评论对象
     * @return 受影响行数
     */
    int addcomment(Comment c);

    /**
     * 删除评论
     * @param commentid 评论编号
     * @return 受影响行数
     */
    int deletecomment(int commentid);
}

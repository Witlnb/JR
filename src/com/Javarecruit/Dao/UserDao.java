package com.Javarecruit.Dao;

import com.Javarecruit.pojo.User;

public interface UserDao {
    /**
     * 修改
     * @return 返回确认数值
     */
    int revise(User user);

    /**
     * 新增
     * @param user 用户
     * @return 返回受影响行数
     */
    int addByUser(User user);
}

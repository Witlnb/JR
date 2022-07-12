package com.Javarecruit.Service;

import com.Javarecruit.pojo.User;

public interface UserService {
    /**
     * 修改
     * @return 修改提示
     */
    int revise();

    /**
     * 用户注册
     * @param user
     * @return
     */
    String enroll(User user);
}

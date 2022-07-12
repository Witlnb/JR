package com.Javarecruit.Service;

import com.Javarecruit.pojo.User;

public interface UserService {
    /**
     * 修改
     * @return 修改提示
     */
    int revise();

    /**
     *
     * @param user
     * @return
     */
    String add(User user);
}

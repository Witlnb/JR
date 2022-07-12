package com.Javarecruit.Service.ServiceImpl;

import com.Javarecruit.Dao.DaoImpl.UserDaoImpl;
import com.Javarecruit.Dao.UserDao;
import com.Javarecruit.Service.UserService;
import com.Javarecruit.pojo.User;

public class UserServiceImpl implements UserService {
    /**
     * 修改
     * @return 返回信息
     */
    @Override
    public int revise() {

        return 0;
    }

    @Override
    public String add(User user) {
        UserDao userDao = new UserDaoImpl();
        userDao.addByUser(user);
        return "成功";
    }
}

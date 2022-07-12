package com.Javarecruit.Dao.DaoImpl;

import com.Javarecruit.Dao.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public int revise() {
        String sql = "update user set upwd = ?,phone = ?,marke";
        return 0;
    }
}

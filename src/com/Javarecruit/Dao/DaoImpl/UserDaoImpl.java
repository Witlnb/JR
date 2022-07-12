package com.Javarecruit.Dao.DaoImpl;

import com.Javarecruit.Dao.BaseDao;
import com.Javarecruit.Dao.UserDao;
import com.Javarecruit.pojo.User;

public class UserDaoImpl extends BaseDao implements UserDao {
    @Override
    public int revise() {
        String sql = "update user set upwd = ?,phone = ?,marke";
        return 0;
    }

    @Override
    public int addByUser(User user) {
        String sql = "insert into user values(uname,upwd,phone,mark,email,nid,study,job,sex,address,personal)";
        Object[] objects={user.getUname(),user.getUpwd(),user.getPhone(),user.getMark(),user.getEmail(),user.getNid(),user.getStudy(),user.getJob(),user.getSex(),user.getAddress(),user.getPersonal()};
        int insert = exceuteUpdate(sql, objects);
        return insert;
    }
}

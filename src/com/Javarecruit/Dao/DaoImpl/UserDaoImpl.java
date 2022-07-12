package com.Javarecruit.Dao.DaoImpl;

import com.Javarecruit.Dao.BaseDao;
import com.Javarecruit.Dao.UserDao;
import com.Javarecruit.pojo.User;

public class UserDaoImpl extends BaseDao implements UserDao  {
    /**
     * 修改用户数据
     * @param u 用户实体
     * @return 修改确认信息
     */
    @Override
    public int revise(User u) {
        String sql = "update `user` set upwd = ? , phone = ? , mark = ? , email = ? , study=? , job=? , address=? , personal = ? WHERE uid = ?;";
        Object[] o = {u.getUpwd(),u.getPhone(),u.getMark(),u.getEmail(),u.getStudy(),u.getJob(),u.getAddress(),u.getPersonal(),u.getUid()};
        return exceuteUpdate(sql,o);
    }

    @Override
    public int addByUser(User user) {
        String sql = "insert into user(uname,upwd,phone,mark,email,nid,study,job,sex,address,personal) values(?,?,?,?,?,?,?,?,?,?,?)";
        Object[] objects={user.getUname(),user.getUpwd(),user.getPhone(),user.getMark(),user.getEmail(),user.getNid(),user.getStudy(),user.getJob(),user.getSex(),user.getAddress(),user.getPersonal()};
        int insert = exceuteUpdate(sql, objects);
        return insert;
    }
}

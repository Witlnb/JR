package com.Javarecruit.Dao.DaoImpl;

import com.Javarecruit.Dao.BaseDao;
import com.Javarecruit.Dao.UserDao;
import com.Javarecruit.pojo.Comment;
import com.Javarecruit.pojo.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl extends BaseDao implements UserDao  {

    /**
     * 修改用户数据
     * @param u 用户实体
     * @return 修改确认信息
     */
    @Override
    public int revise(User u) {
        String sql = "update `user` set upwd = ? , phone = ? ,email = ? , study=? , job=? , address=? , personal = ? WHERE uid = ?";
        Object[] o = {u.getUpwd(),u.getPhone(),u.getEmail(),u.getStudy(),u.getJob(),u.getAddress(),u.getPersonal(),u.getUid()};
        return exceuteUpdate(sql,o);
    }

    /**
     * 新增
     * @param user 用户
     * @return
     */
    @Override
    public int addByUser(User user) {
        String sql = "insert into user(uname,upwd,phone,email,nid,study,job,sex,address,personal) values(?,?,?,?,?,?,?,?,?,?)";
        Object[] objects={user.getUname(),user.getUpwd(),user.getPhone(),user.getEmail(),user.getNid(),user.getStudy(),user.getJob(),user.getSex(),user.getAddress(),user.getPersonal()};
        int insert = exceuteUpdate(sql, objects);
        return insert;
    }

    /**
     * 查询
     * @param phone 用户名
     * @param pwd 密码
     * @return
     */
    @Override
    public User querybynamepwd(String phone, String pwd) {
        Connection con = conn();
        PreparedStatement ps = null;
        ResultSet rs = null;
        User u = new User();
        String sql = "select * from user where phone=? and upwd=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, phone);
            ps.setString(2, pwd);
            rs = ps.executeQuery();
            if (rs.next()) {
                u.setUid(rs.getInt("uid"));
                u.setUname(rs.getString("uname"));
                u.setUpwd(rs.getString("upwd"));
                u.setPhone(rs.getString("phone"));
                u.setMark(rs.getString("mark"));
                u.setEmail(rs.getString("email"));
                u.setNid(rs.getString("nid"));
                u.setStudy(rs.getString("study"));
                u.setJob(rs.getString("job"));
                u.setSex(rs.getString("sex"));
                u.setAddress(rs.getString("address"));
                u.setPersonal(rs.getString("personal"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeAll(con, ps, rs);
        }
        return u;
    }

    @Override
    public int addcomment(Comment c) {
        String sql="insert into comment values(0,?,?,?)";
        Object[] o={c.getCmtscontent(),c.getUid(),c.getCmtstime()};
        int i =exceuteUpdate(sql,o);
        return i;
    }

    @Override
    public int deletecomment(int commentid) {
        String sql="delete from comment where commentid=?";
        Object[] o={commentid};
        int i=exceuteUpdate(sql,o);
        return i;
    }

    /**
     * 查询全部的方法
     */
    @Override
    public List<User> queryAll() {
        Connection con=conn();
        PreparedStatement ps=null;
        ResultSet rs=null;
        String sql="select * from `user`";
        List<User> us=new ArrayList<User>();
        try{
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                User u=new User();
                u.setUpwd(rs.getString("uname"));
                u.setPhone(rs.getString("phone"));
                u.setEmail(rs.getString("email"));
                u.setStudy(rs.getString("study"));
                u.setJob(rs.getString("job"));
                u.setSex(rs.getString("sex"));
                us.add(u);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return us;
    }
}

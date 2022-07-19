package com.Javarecruit.Dao.DaoImpl;

import com.Javarecruit.Dao.BaseDao;
import com.Javarecruit.Dao.HrDao;
import com.Javarecruit.pojo.Hr;
import com.Javarecruit.pojo.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HrDaoImpl extends BaseDao implements HrDao {
    /**
     * 新增
     * @param hr
     * @return
     */
    @Override
    public int addByHr(Hr hr) {
        String sql = "insert into hr(cshow,company,phone,caddress,hmoney,cpwd) values(?,?,?,?,?,?)";
        Object[] objects ={hr.getCshow(),hr.getCompany(),hr.getPhone(),hr.getCaddress(),hr.getHmoney(),hr.getCpwd()};
        int insert = exceuteUpdate(sql, objects);
        return insert;
    }

    /**
     * 查询
     * @param phone 手机号
     * @param cpwd 密码
     * @return 对象
     */
    @Override
    public Hr querybyphone(String phone,String cpwd) {
        Connection con = conn();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Hr h = new Hr();
        String sql = "select * from hr where phone=? and cpwd=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1,phone);
            ps.setString(2,cpwd);
            rs = ps.executeQuery();
            if (rs.next()) {
                h.setCompanyid(rs.getInt("companyid"));
                h.setCshow(rs.getString("cshow"));
                h.setCompany(rs.getString("company"));
                h.setPhone(rs.getString("phone"));
                h.setCaddress(rs.getString("caddress"));
                h.setCpwd(rs.getString("cpwd"));
                h.setHmoney(rs.getInt("hmoney"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeAll(con, ps, rs);
        }
        return h;
    }

    /**
     * 修改hr信息
     * @param h hr实体类
     * @return 确认信息
     */
    @Override
    public int reviseHr(Hr h) {
        String sql = "update hr set cshow = ? , company = ? ,phone = ? ,  caddress=?  , hmoney = ? WHERE companyid = ?";
        Object[] o = {h.getCshow(),h.getCompany(),h.getPhone(),h.getCaddress(),h.getHmoney(),h.getCompanyid()};
        return exceuteUpdate(sql,o);
    }
}

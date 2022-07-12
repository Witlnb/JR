package com.Javarecruit.Dao.DaoImpl;

import com.Javarecruit.Dao.BaseDao;
import com.Javarecruit.Dao.ShowDao;
import com.Javarecruit.pojo.Show;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ShowDaoImpl extends BaseDao implements ShowDao {
    //查询全部的方法
    @Override
    public List<Show> queryAll() {
        Connection con=conn();
        PreparedStatement ps=null;
        ResultSet rs=null;
        List<Show> sh=new ArrayList<Show>();
        String sql="select * from show";
        try{
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Show s=new Show();
                s.setSid(rs.getInt("sid"));
                s.setTitle(rs.getString("title"));
                s.setShow(rs.getString("show"));
                s.setCompany(rs.getString("company"));
                s.setCompanyid(rs.getInt("companyid"));
                sh.add(s);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sh;
    }
}

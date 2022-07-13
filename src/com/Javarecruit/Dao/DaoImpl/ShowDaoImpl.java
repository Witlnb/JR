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
        String sql="select * from `show`";
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
    //根据薪资展示的方法
    @Override
    public Show queryMoney(Integer money) {
        Connection con=conn();
        PreparedStatement ps=null;
        ResultSet rs=null;
        Show ss=new Show();
        String sql="select * from `show` where money=?";
        try{
            ps=con.prepareStatement(sql);
            ps.setInt(1,money);
            rs=ps.executeQuery();
            if(rs.next()){
                ss.setSid(rs.getInt("sid"));
                ss.setTitle(rs.getString("title"));
                ss.setShow(rs.getString("show"));
                ss.setCompany(rs.getString("company"));
                ss.setCompanyid(rs.getInt("companyid"));
                ss.setMoney(rs.getInt("money"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ss;
    }
//根据标签展示的方法
    @Override
    public Show queryTitle(String title) {
        Connection con=conn();
        PreparedStatement ps=null;
        ResultSet rs=null;
        Show ss=new Show();
        String sql="select * from `show` where title=?";
        try{
            ps=con.prepareStatement(sql);
            ps.setString(1,title);
            rs=ps.executeQuery();
            if(rs.next()){
                ss.setSid(rs.getInt("sid"));
                ss.setTitle(rs.getString("title"));
                ss.setShow(rs.getString("show"));
                ss.setCompany(rs.getString("company"));
                ss.setCompanyid(rs.getInt("companyid"));
                ss.setMoney(rs.getInt("money"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ss;
    }
//根据薪资和标签展示的方法
    @Override
    public Show queryMoneyTitle(Integer money, String title) {
        Connection con=conn();
        PreparedStatement ps=null;
        ResultSet rs=null;
        Show ss=new Show();
        String sql="select * from `show` where money=? and title=?";
        try{
            ps=con.prepareStatement(sql);
            ps.setInt(1,money);
            ps.setString(2,title);
            rs=ps.executeQuery();
            if(rs.next()){
                ss.setSid(rs.getInt("sid"));
                ss.setTitle(rs.getString("title"));
                ss.setShow(rs.getString("show"));
                ss.setCompany(rs.getString("company"));
                ss.setCompanyid(rs.getInt("companyid"));
                ss.setMoney(rs.getInt("money"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ss;
    }
//根据薪资范围展示的方法
    @Override
    public Show queryTwoMoney(Integer one, Integer two) {
        Connection con=conn();
        PreparedStatement ps=null;
        ResultSet rs=null;
        Show ss=new Show();
        String sql="select * from `show` where money between ? and ?";
        try{
            ps=con.prepareStatement(sql);
            ps.setInt(1,one);
            ps.setInt(2,two);
            rs=ps.executeQuery();
            if(rs.next()){
                ss.setSid(rs.getInt("sid"));
                ss.setTitle(rs.getString("title"));
                ss.setShow(rs.getString("show"));
                ss.setCompany(rs.getString("company"));
                ss.setCompanyid(rs.getInt("companyid"));
                ss.setMoney(rs.getInt("money"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ss;
    }

    /**
     * 修改展示信息
     * @param s 展示实体类
     * @return  修改确认
     */
    @Override
    public int reviseShow(Show s) {
        String sql = "update Hr set title = ? , company = ? ,show = ? ,money = ?  WHERE companyid = ? and sid=?";
        Object[] o = {s.getTitle(),s.getCompany(),s.getShow(),s.getMoney(),s.getCompanyid(),s.getSid()};
        return exceuteUpdate(sql,o);
    }
}

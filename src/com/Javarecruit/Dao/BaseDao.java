package com.Javarecruit.Dao;

import java.sql.*;

public class BaseDao {
    String driver ="com.mysql.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/recruit";
    String user = "root";
    String password = "root";
    /**
     * 创建建立连接数据库
     */
    public Connection conn(){
        Connection con = null;
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url,user,password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }
    /**
     * 关闭数据库流
     */
    public void closeAll(Connection co, PreparedStatement pr, ResultSet re){
        try {
            if (re!=null){
                re.close();
            }
            if (pr!=null){
                pr.close();
            }
            if (co!=null){
                co.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    /**
     * 操作增删改方法
     */
    public int exceuteUpdate(String sql,Object[] ob){
        Connection con = conn();
        PreparedStatement pr = null;
        int num=0;
        try {
            pr =con.prepareStatement(sql);
            if (ob!=null){
                for (int i=0;i<ob.length;i++){
                    pr.setObject(i+1,ob[i]);
                }
            }
            num = pr.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return num;
    }
}

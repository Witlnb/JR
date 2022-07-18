package com.Javarecruit.Dao.DaoImpl;

import com.Javarecruit.Dao.BaseDao;
import com.Javarecruit.Dao.CommentDao;
import com.Javarecruit.pojo.Comment;
import com.Javarecruit.pojo.Hr;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CommentDaoImpl extends BaseDao implements  CommentDao {
    /**
     * 新增评论
     * @param c 评论对象
     * @return  受影响行数
     */
    @Override
    public int addComment(Comment c) {
        String sql="insert into comment values(0,?,?,?)";
        Object[] o={c.getCmtscontent(),c.getUid(),c.getCmtstime()};
        int i=exceuteUpdate(sql,o);
        return i;
    }

    @Override
    public Comment chaComment(int uid) {
        Connection con = conn();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql="select * from comment where uid=?";
        Comment cc=new Comment();
        try{
            ps=con.prepareStatement(sql);
            ps.setInt(1,uid);
            rs=ps.executeQuery();
            while(rs.next()){
                cc.setCmtscontent(rs.getString("cmtscontent"));
                cc.setUid(rs.getInt("uid"));
                cc.setCmtstime(rs.getInt("cmtstime"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cc;
    }
}


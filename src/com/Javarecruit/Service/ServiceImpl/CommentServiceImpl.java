package com.Javarecruit.Service.ServiceImpl;

import com.Javarecruit.Dao.CommentDao;
import com.Javarecruit.Dao.DaoImpl.CommentDaoImpl;
import com.Javarecruit.Service.CommentService;
import com.Javarecruit.pojo.Comment;

public class CommentServiceImpl implements CommentService {
    @Override
    public String addComment(Comment c) {
        CommentDao cd=new CommentDaoImpl();
        int addcomment = cd.addComment(c);
        if (addcomment==0){
            return "失败";
        }
        return "成功";
    }

    @Override
    public Comment chaComment(int uid) {
        CommentDao cd=new CommentDaoImpl();
        Comment comment = cd.chaComment(uid);
        return comment;
    }
}

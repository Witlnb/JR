package com.Javarecruit.Dao;

import com.Javarecruit.pojo.Comment;
import com.Javarecruit.pojo.Hr;

public interface CommentDao {
    /**
     * 新增评论
     * @param c 评论对象
     * @return 受影响行数
     */
    int addComment(Comment c);

    /**
     * 查看评论
     * @param uid 评论编号
     * @return 对象
     */
    Comment chaComment(int uid);
}

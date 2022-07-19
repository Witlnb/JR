package com.Javarecruit.Service;

import com.Javarecruit.pojo.Comment;

public interface CommentService {
    /**
     * 用户评论
     * @param c 评论对象
     * @return 评论成功失败
     */
    String addComment(Comment c);

    /**
     * 查看评论
     * @param uid 用户编号
     * @return 结果
     */
    Comment chaComment(int uid);
}

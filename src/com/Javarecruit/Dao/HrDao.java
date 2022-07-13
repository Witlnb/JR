package com.Javarecruit.Dao;

import com.Javarecruit.pojo.Hr;
import com.Javarecruit.pojo.User;

public interface HrDao {
    /**
     * 新增
     * @param hr
     * @return 返回受影响行数
     */
    int addByHr(Hr hr);
    /**
     * 查询
     * @param phone 手机号
     * @return
     */
    public Hr querybyphone(String phone);
    /**
     * 修改Hr信息
     * @return 返回确认数值
     */
    int reviseHr(Hr h);
}

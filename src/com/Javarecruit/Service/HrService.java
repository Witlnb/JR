package com.Javarecruit.Service;

import com.Javarecruit.pojo.Hr;
import com.Javarecruit.pojo.User;

public interface HrService {
    /**
     * 人事注册
     * @param hr
     * @return
     */
    int enroll(Hr hr);
    /**
     * 修改hr信息
     * @return 修改提示
     */
    int reviseHr(Hr h);

    /**
     * 登录
     * @param phone 手机号
     * @param cpwd 密码
     * @return 登录成功失败
     */
    String login(String phone,String cpwd);
}

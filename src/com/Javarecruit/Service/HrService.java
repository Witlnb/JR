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
     * HR登录
     * @param phone 手机号
     * @return
     */
    String login(String phone);
}

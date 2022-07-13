package com.Javarecruit.Service;

import com.Javarecruit.pojo.Hr;
import com.Javarecruit.pojo.User;

public interface HrService {
    /**
     * 人事注册
     * @param hr
     * @return
     */
    String enroll(Hr hr);
    /**
     * 修改hr信息
     * @return 修改提示
     */
    int reviseHr(Hr h);
}

package com.Javarecruit.Service.ServiceImpl;

import com.Javarecruit.Dao.DaoImpl.HrDaoImpl;
import com.Javarecruit.Dao.HrDao;
import com.Javarecruit.Service.HrService;
import com.Javarecruit.pojo.Hr;

public class HrServiceImpl implements HrService {
    /**
     * 人事注册
     * @param hr
     * @return
     */
    @Override
    public int enroll(Hr hr) {
        HrDao hrDao = new HrDaoImpl();
        int hr1 = hrDao.addByHr(hr);
        return hr1;
    }

    @Override
    public int reviseHr(Hr h) {
        HrDao hrDao = new HrDaoImpl();
        return hrDao.reviseHr(h);
    }

    /**
     * hr登录
     * @param phone 手机号
     * @param cpwd 密码
     * @return 登录成功失败
     */
    @Override
    public String login(String phone,String cpwd) {
        HrDao hd = new HrDaoImpl();
        Hr querybynamepwd = hd.querybyphone(phone,cpwd);
        if (querybynamepwd.getPhone()==null&&querybynamepwd.getCpwd()==null){
            return "失败";
        }
        return "成功";
    }
}

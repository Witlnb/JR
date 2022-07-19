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
        HrDaoImpl hrDao = new HrDaoImpl();
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
        Hr querybyphone = hd.querybyphone(phone, cpwd);
        if (querybyphone.getPhone()!=null && querybyphone.getCpwd()!=null){
            return "成功";
        }
        return "失败";
    }
    /**
     * hr储存登录信息
     */
    @Override
    public Hr SessionH(String phone,String cpwd) {
        HrDao hd = new HrDaoImpl();
        Hr querybyphone = hd.querybyphone(phone, cpwd);
       return querybyphone;
    }
}

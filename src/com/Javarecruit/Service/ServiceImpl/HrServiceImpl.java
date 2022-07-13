package com.Javarecruit.Service.ServiceImpl;

import com.Javarecruit.Dao.DaoImpl.HrDaoImpl;
import com.Javarecruit.Dao.HrDao;
import com.Javarecruit.Service.HrService;
import com.Javarecruit.pojo.Hr;

public class HrServiceImpl implements HrService {
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

    @Override
    public String login(String phone) {
        HrDao hd = new HrDaoImpl();
        Hr querybynamepwd = hd.querybyphone(phone);
        if (querybynamepwd.getPhone()==null){
            return "失败";
        }
        return "成功";
    }
}

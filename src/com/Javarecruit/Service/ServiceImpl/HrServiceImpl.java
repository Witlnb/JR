package com.Javarecruit.Service.ServiceImpl;

import com.Javarecruit.Dao.DaoImpl.HrDaoImpl;
import com.Javarecruit.Dao.HrDao;
import com.Javarecruit.Service.HrService;
import com.Javarecruit.pojo.Hr;

public class HrServiceImpl implements HrService {
    @Override
    public String enroll(Hr hr) {
        HrDao hrDao = new HrDaoImpl();
        hrDao.addByHr(hr);
        return "成功";
    }
}

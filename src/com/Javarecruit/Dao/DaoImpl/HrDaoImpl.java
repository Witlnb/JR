package com.Javarecruit.Dao.DaoImpl;

import com.Javarecruit.Dao.BaseDao;
import com.Javarecruit.Dao.HrDao;
import com.Javarecruit.pojo.Hr;

public class HrDaoImpl extends BaseDao implements HrDao {

    @Override
    public int addByHr(Hr hr) {
        String sql = "insert into hr(cshow,company,phone,caddress,hmoney) values(?,?,?,?,?)";
        Object[] objects ={hr.getCshow(),hr.getCompany(),hr.getPhone(),hr.getCaddress(),hr.getHmoney()};
        int insert = exceuteUpdate(sql, objects);
        return insert;
    }
}

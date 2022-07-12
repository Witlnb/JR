package com.Javarecruit.Service.ServiceImpl;

import com.Javarecruit.Dao.DaoImpl.ShowDaoImpl;
import com.Javarecruit.Service.ShowService;
import com.Javarecruit.pojo.Show;

import java.util.List;

public class ShowServiceImpl implements ShowService {
    //展示全部的方法
    @Override
    public List<Show> showAll() {
        ShowDaoImpl sdi=new ShowDaoImpl();
        List<Show> ss=sdi.queryAll();
        return ss;
    }
}

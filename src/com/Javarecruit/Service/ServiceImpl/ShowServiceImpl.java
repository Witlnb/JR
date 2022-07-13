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
//根据薪资展示的方法
    @Override
    public Show money(Integer money) {
        ShowDaoImpl sdi=new ShowDaoImpl();
        Show s=sdi.queryMoney(money);
        return s;
    }
//根据标签展示的方法
    @Override
    public Show title(String title) {
        ShowDaoImpl sd=new ShowDaoImpl();
        Show ss=sd.queryTitle(title);
        return ss;
    }
//根据标签和薪资展示的方法
    @Override
    public Show titleMoney(Integer money, String title) {
        ShowDaoImpl ssd=new ShowDaoImpl();
        Show sh=ssd.queryMoneyTitle(money,title);
        return sh;
    }
//根据薪资的范围展示的方法
    @Override
    public Show twoMoney(Integer one, Integer two) {
        ShowDaoImpl sdd=new ShowDaoImpl();
        Show sw=sdd.queryTwoMoney(one,two);
        return sw;
    }

    @Override
    public int revise(Show s) {
        ShowDaoImpl sdd=new ShowDaoImpl();
        return sdd.reviseShow(s);
    }
}

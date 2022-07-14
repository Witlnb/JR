package com.Javarecruit.Service.ServiceImpl;

import com.Javarecruit.Dao.DaoImpl.ShowDaoImpl;
import com.Javarecruit.Dao.ShowDao;
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
    public List<Show> money(Integer money) {
        ShowDaoImpl sdi=new ShowDaoImpl();
        List<Show> s=sdi.queryMoney(money);
        return s;
    }
//根据标签展示的方法
    @Override
    public List<Show> title(String title) {
        ShowDaoImpl sd=new ShowDaoImpl();
        List<Show> ss=sd.queryTitle(title);
        return ss;
    }
//根据标签和薪资展示的方法
    @Override
    public List<Show> titleMoney(Integer money, String title) {
        ShowDaoImpl ssd=new ShowDaoImpl();
        List<Show> sh=ssd.queryMoneyTitle(money,title);
        return sh;
    }
//根据薪资的范围展示的方法
    @Override
    public List<Show> twoMoney(Integer one, Integer two) {
        ShowDaoImpl sdd=new ShowDaoImpl();
        List<Show> sw=sdd.queryTwoMoney(one,two);
        return sw;
    }

    @Override
    public int revise(Show s) {
        ShowDaoImpl sdd=new ShowDaoImpl();
        return sdd.reviseShow(s);
    }

    /**
     * 发布招聘信息
     * @param s 展示对象
     * @return
     */
    @Override
    public int addrecruit(Show s) {
        ShowDao sd = new ShowDaoImpl();
        int sd1 = sd.recruit(s);
        if (sd1==0){
            return 0;
        }else{
            return 1;
        }
    }

    /**
     * 展示招聘信息
     * @return
     */
    @Override
    public List<Show> All() {
        ShowDao showDao = new ShowDaoImpl();
        List<Show> showList = showDao.selectAll();
        return showList;
    }
}

package com.Javarecruit.Service.ServiceImpl;

import com.Javarecruit.Dao.DaoImpl.ShowDaoImpl;
import com.Javarecruit.Dao.ShowDao;
import com.Javarecruit.Service.ShowService;
import com.Javarecruit.Util.Page;
import com.Javarecruit.pojo.Show;

import java.sql.Connection;
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

    private ShowDao showDao = new ShowDaoImpl();
    private int count = 0;
    /**
     * count的值一般情况下不会发生变化，期望减少数据库操作的频次
     * 可以使用代理模式解决，将count变量移动到外部帮助类
     */
    @Override
    public void getCount() {
        count = showDao.getCount();
    }

    @Override
    public Page getPageByIndex(int index, int pageSize) {
        Page page = new Page();
        page.setPageSize(pageSize);
        if (count == 0){
            getCount();
            page.setTotalCount(count);
            page.setIndex(index);
            page.setShowList(showDao.getPageByIndex(index,pageSize));
        }

        return page;
    }

    /**
     * 展示公司招聘信息
     */
    @Override
    public Show showComp(Integer one) {
        ShowDaoImpl ss = new ShowDaoImpl();
        ss.showComp(one);
        return  ss.showComp(one);
    }

    @Override
    public List<Show> queryBlure(String a) {
        ShowDaoImpl ss = new ShowDaoImpl();
        List<Show> s = ss.queryBlure(a);
        List<Show> stwo = ss.queryBlureTitle(a);
        if (!s.isEmpty()){
            return s;
        }else if(!stwo.isEmpty()){
            return stwo;
        }else{
            return null;
        }

    }
}

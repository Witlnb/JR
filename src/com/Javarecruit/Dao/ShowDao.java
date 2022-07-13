package com.Javarecruit.Dao;

import com.Javarecruit.pojo.Show;

import java.util.List;

public interface ShowDao {
    //查询全部的方法
    List<Show> queryAll();
    //根据薪资展示的方法；
    List<Show> queryMoney(Integer money);
    //根据标签展示的方法；
    List<Show> queryTitle(String title);
    //根据薪资和标签展示的方法
    List<Show> queryMoneyTitle(Integer money,String title);
    //根据薪资的范围展示的方法
    List<Show> queryTwoMoney(Integer one,Integer two);
    //修改展示信息
    public int reviseShow(Show s);

    /**
     * 新增
     * @param s
     * @return
     */
    int recruit(Show s);
}

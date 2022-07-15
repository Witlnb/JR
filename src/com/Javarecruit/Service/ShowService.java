package com.Javarecruit.Service;

import com.Javarecruit.pojo.Show;
import com.Javarecruit.pojo.User;

import java.util.List;

public interface ShowService {
    //展示全部的方法
    List<Show> showAll();
    //根据标签展示的方法
    List<Show> money(Integer money);
    //根据标签展示的方法
    List<Show> title(String title);
    //根据标签和薪资展示的方法
    List<Show> titleMoney(Integer money,String title);
    //根据薪资的范围展示的方法
    List<Show> twoMoney(Integer one,Integer two);
    /**
     * 修改展示
     * @return 修改提示
     */
    int revise(Show s);
    /**
     * 发布招聘信息
     * @param s 展示对象
     * @return 发布成功和失败
     */
    int addrecruit(Show s);

    /**
     * 展示招聘信息
     * @return
     */
    List<Show> All();

    /**
     * 获取总记录数
     */
    void getCount();
}

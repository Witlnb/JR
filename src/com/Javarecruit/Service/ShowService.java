package com.Javarecruit.Service;

import com.Javarecruit.pojo.Show;

import java.util.List;

public interface ShowService {
    //展示全部的方法
    List<Show> showAll();
    //根据标签展示的方法
    Show money(Integer money);
    //根据标签展示的方法
    Show title(String title);
    //根据标签和薪资展示的方法
    Show titleMoney(Integer money,String title);
    //根据薪资的范围展示的方法
    Show twoMoney(Integer one,Integer two);
}

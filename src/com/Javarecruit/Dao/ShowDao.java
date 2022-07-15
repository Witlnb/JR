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
     * @param s 展示招聘信息对象
     * @return 受影响行数
     */
    int recruit(Show s);

    /**
     * 查询全部信息
     * @return
     */
    List<Show> selectAll();

    /**
     * 获取总记录数
     * @return 总记录数
     */
    int getCount();

    /**
     * 获取分页信息
     * @param index 当前页码
     * @param pageSize 每页显示的条目数
     * @return 当前页码对应的分页信息
     */
    List<Show> getPageByIndex(int index,int pageSize);
}

package com.Javarecruit.Util;

import com.Javarecruit.pojo.Show;

import java.util.ArrayList;
import java.util.List;

public class Page {
    private int index;	// 当前页码
    private int pageSize;	// 每页条目数
    private int totalCount;	// 总记录数
    private int totalPageCount;	// 总页数
    private List<Show> showList = new ArrayList<Show>();

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
        this.totalPageCount = totalCount % pageSize == 0
                ? totalCount / pageSize
                : (totalCount / pageSize) + 1;
    }

    public int getTotalPageCount() {
        return totalPageCount;
    }

    public void setTotalPageCount(int totalPageCount) {
        this.totalPageCount = totalPageCount;
    }

    public List<Show> getShowList() {
        return showList;
    }

    public void setShowList(List<Show> showList) {
        this.showList = showList;
    }
}

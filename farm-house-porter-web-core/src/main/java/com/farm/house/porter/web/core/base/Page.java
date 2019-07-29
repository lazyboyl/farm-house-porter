package com.farm.house.porter.web.core.base;

import java.util.List;

/**
 * 分页实体类
 *
 * @author linzf
 * @since 2019-02-26
 */
public class Page {
    private int page;
    private int size;
    private List rows;
    private long total;

    public Page() {
    }

    public Page(List rows, long total, int page, int size) {
        super();
        this.rows = rows;
        this.total = total;
        this.page = page;
        this.size = size;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List getRows() {
        return rows;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

}

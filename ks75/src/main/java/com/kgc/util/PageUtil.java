package com.kgc.util;

import java.util.List;

//分页
public class PageUtil<T> {
    private Integer pageIndex;//当前页码
    private Integer pageSize;//每页条数
    private Integer totalCount;//总条数
    private Integer totalPage;//总页数
    private List<T> list;//每页的数据集合
    public PageUtil() {
        super();
        // TODO Auto-generated constructor stub
    }
    public PageUtil(Integer pageIndex, Integer pageSize, Integer totalCount,
                    Integer totalPage, List<T> list) {
        super();
        this.pageIndex = pageIndex;
        this.pageSize = pageSize;
        this.totalCount = totalCount;
        this.totalPage = totalPage;
        this.list = list;
    }
    public Integer getPageIndex() {
        return pageIndex;
    }
    public void setPageIndex(Integer pageIndex) {
		/*//如果小于1 就在第一页
		if(this.pageIndex<1){
			this.pageIndex=1;
		}
		//如果大于总页数 就在最后一页
		if(this.pageIndex>this.totalPage){
			this.pageIndex=this.totalPage;
		}*/
        this.pageIndex = pageIndex;
    }
    public Integer getPageSize() {
        return pageSize;
    }
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
    public Integer getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        //计算总页数
        //整数：  总页数=总记录数/每页显示记录
        //整数：  总页数=总记录数/每页显示记录
        //使用三元运算符
        this.totalPage=(this.totalCount%this.pageSize==0)?
                this.totalCount/this.pageSize : this.totalCount/this.pageSize+1;

    }
    public Integer getTotalPage() {
        return totalPage;
    }
    /*public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }*/
    public List<T> getList() {
        return list;
    }
    public void setList(List<T> list) {
        this.list = list;
    }


}

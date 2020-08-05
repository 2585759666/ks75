package com.kgc.pojo;

/**
 * 部门表
 */
public class Department {
    private Integer id;// 部门id
    private String  deptname;// 部门名称

    public Department() {

    }

    public Department(Integer id, String deptname) {
        this.id = id;
        this.deptname = deptname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }
}

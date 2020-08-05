package com.kgc.pojo;

/**
 * 人才表
 */
public class Enterprisetalent {
  private Integer  id;  //人才编号
  private String name;  //人才姓名
    private Integer  workingLife; //工作年限
    private String   workExperience; //工作经历
    private String personalProfile; //个人简历
    private Integer  departmentId;  //所属部门
    private String graduateSchool; //毕业院校

    private String deptname;//部门名称
    public Enterprisetalent() {

    }
    public Enterprisetalent(Integer id, String name, Integer workingLife, String workExperience, String personalProfile, Integer departmentId, String graduateSchool, String deptname) {
        this.id = id;
        this.name = name;
        this.workingLife = workingLife;
        this.workExperience = workExperience;
        this.personalProfile = personalProfile;
        this.departmentId = departmentId;
        this.graduateSchool = graduateSchool;
        this.deptname = deptname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWorkingLife() {
        return workingLife;
    }

    public void setWorkingLife(Integer workingLife) {
        this.workingLife = workingLife;
    }

    public String getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(String workExperience) {
        this.workExperience = workExperience;
    }

    public String getPersonalProfile() {
        return personalProfile;
    }

    public void setPersonalProfile(String personalProfile) {
        this.personalProfile = personalProfile;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getGraduateSchool() {
        return graduateSchool;
    }

    public void setGraduateSchool(String graduateSchool) {
        this.graduateSchool = graduateSchool;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }
}

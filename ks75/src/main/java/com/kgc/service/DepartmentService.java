package com.kgc.service;


import com.kgc.pojo.Department;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 部门业务逻辑层接口
 */
public interface DepartmentService {

    public List<Department> getAllDepartment();


}



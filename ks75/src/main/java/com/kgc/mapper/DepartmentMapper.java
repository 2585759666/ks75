package com.kgc.mapper;

import com.kgc.pojo.Department;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 部门接口
 */
@Mapper
public interface DepartmentMapper {

    //查询所有部门
    public List<Department> getAllDepartment();
}

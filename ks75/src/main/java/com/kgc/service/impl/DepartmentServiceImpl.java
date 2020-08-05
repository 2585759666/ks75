package com.kgc.service.impl;

import com.alibaba.fastjson.JSON;
import com.kgc.mapper.DepartmentMapper;
import com.kgc.pojo.Department;
import com.kgc.service.DepartmentService;
import com.kgc.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    DepartmentMapper departmentMapper;

    @Override
    public List<Department> getAllDepartment() {
        return departmentMapper.getAllDepartment();
    }
}

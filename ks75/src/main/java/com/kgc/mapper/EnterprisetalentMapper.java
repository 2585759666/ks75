package com.kgc.mapper;

import com.kgc.pojo.Enterprisetalent;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 人才接口
 */
@Mapper
public interface EnterprisetalentMapper {

    //分页查询所有部门
    public List<Enterprisetalent> getPersonPage(@Param("id")Integer id,@Param("from") Integer from, @Param("pageSize")Integer pageSize);
    //查询员工数
    public int getCount(@Param("id")Integer id);
}

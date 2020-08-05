package com.kgc.service;

import com.kgc.pojo.Enterprisetalent;
import com.kgc.util.PageUtil;

import java.util.List;

/**
 * 人才业务逻辑接口
 */
public interface EnterprisetalentService {


    public PageUtil<Enterprisetalent> getSalePage(Integer id, Integer pageIndex,
                                                  Integer pageSize);
}

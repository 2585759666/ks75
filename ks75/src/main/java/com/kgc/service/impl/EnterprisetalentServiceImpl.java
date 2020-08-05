package com.kgc.service.impl;

import com.alibaba.fastjson.JSON;
import com.kgc.mapper.EnterprisetalentMapper;
import com.kgc.pojo.Enterprisetalent;
import com.kgc.service.EnterprisetalentService;
import com.kgc.util.PageUtil;
import com.kgc.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnterprisetalentServiceImpl implements EnterprisetalentService {
    @Autowired
    EnterprisetalentMapper enterprisetalentMapper;


    @Autowired
    private RedisUtil redisUtil;

    @Override
    public PageUtil<Enterprisetalent> getSalePage(Integer id, Integer pageIndex, Integer pageSize) {
        PageUtil<Enterprisetalent> page = new PageUtil<Enterprisetalent>();
        String key = "list";
        if (redisUtil.exist(key)) {
            //从redis读取
            System.out.println("从redis读取");
            page = JSON.parseObject(redisUtil.get(key).toString(), PageUtil.class);
           // List<Enterprisetalent> ent=JSON.parseArray(redisUtil.get(key).toString(),Enterprisetalent.class);
        } else {
            //从数据库读取
            System.out.println("从数据库读取");
            page.setPageIndex(pageIndex);
            page.setPageSize(pageSize);
            int totalCount = enterprisetalentMapper.getCount(id);
            page.setTotalCount(totalCount);
            List<Enterprisetalent> list = enterprisetalentMapper.getPersonPage(id, (pageIndex - 1) * pageSize, pageSize);
            page.setList(list);
            //放redis
            redisUtil.set(key, JSON.toJSONString(page), 20);
        }
        return page;
    }
}

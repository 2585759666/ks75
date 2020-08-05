package com.kgc.controller;

import com.kgc.pojo.Department;
import com.kgc.pojo.Enterprisetalent;
import com.kgc.service.DepartmentService;
import com.kgc.service.EnterprisetalentService;
import com.kgc.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class EnterprisetalentController {
    //业务对象
    @Autowired
    private EnterprisetalentService enterprisetalentService;

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/page")
    public PageUtil<Enterprisetalent> show(@RequestParam(value = "pageindex",defaultValue ="1")int pageindex,
                                @RequestParam(value = "id",defaultValue ="-1")Integer id){
        PageUtil< Enterprisetalent> page=enterprisetalentService.getSalePage(id,pageindex,3);
        return page;
    }

}
